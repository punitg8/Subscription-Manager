package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.ExceptionMessage.DUPLICATE_VALUE_EXCEPTION;
import static com.subscriptionmanager.constants.User.LIST_SUBSCRIPTIONS_MAX_PAGE_SIZE;
import static com.subscriptionmanager.constants.User.LIST_SUBSCRIPTIONS_MIN_PAGE_SIZE;

import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.model.UserSubscription;
import com.subscriptionmanager.repository.UserSubscriptionRepository;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import com.subscriptionmanager.service.UserRepositoryService;
import com.subscriptionmanager.service.UserService;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse;
import com.subscriptionmanager.validations.ValidationService;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

  private final UserRepositoryService userRepositoryService;
  private final SubscriptionRepositoryService subscriptionRepositoryService;
  private final UserSubscriptionRepository userSubscriptionRepository;
  private final ValidationService validationService;

  @Override
  public ListUserSubscriptionsResponse listUserSubscriptions(
      final ListUserSubscriptionsRequest request) {
    Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), "users");

    final User user = userRepositoryService.findById(parentResourceValueMap.get("users"));

    final int pageToken = validationService.validateAndExtractPageToken(request.getPageToken());


    final int pageSize = validationService.validateAndExtractPageSize(request.getPageSize(),
        LIST_SUBSCRIPTIONS_MIN_PAGE_SIZE, LIST_SUBSCRIPTIONS_MAX_PAGE_SIZE);

    return ListUserSubscriptionsResponse.newBuilder()
        .addAllUserSubscription(
            userSubscriptionRepository.findAllByUser(user, PageRequest.of(pageToken, pageSize))
                .stream()
                .map(
                    userSubscription -> com.subscriptionmanager.v1.proto.UserSubscription.newBuilder()
                        .setName("subscriptions/" + userSubscription.getSubscription().getId())
                        .setDisplayName(userSubscription.getSubscription().getName())
                        .setExpiryDate(com.google.type.Date.newBuilder()
                            .setDay(userSubscription.getExpiryDate().toLocalDate().getDayOfMonth())
                            .setMonth(
                                userSubscription.getExpiryDate().toLocalDate().getMonthValue())
                            .setYear(userSubscription.getExpiryDate().toLocalDate().getYear())
                            .build())
                        .build())
                .toList()
        )
        .setNextPageToken(Integer.toString(pageToken + 1))
        .build();
  }

  @Override
  public AddUserSubscriptionResponse addUserSubscription(final AddUserSubscriptionRequest request) {
    Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), "users");

    final User user = userRepositoryService.findById(parentResourceValueMap.get("users"));

    Map<String, String> nameResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getName(), "subscriptions");

    final Subscription subscription =
        subscriptionRepositoryService.findById(nameResourceValueMap.get("subscriptions"));

    if (userSubscriptionRepository.existsByUserAndSubscription(user, subscription)) {
      throw InvalidArgumentException.builder()
          .violationMessage(DUPLICATE_VALUE_EXCEPTION)
          .fieldValue(subscription.toString())
          .build();
    }

    final LocalDate expiryDate = LocalDate.now().plusDays(subscription.getValidity());

    final UserSubscription userSubscription = UserSubscription.builder()
        .user(user)
        .subscription(subscription)
        .expiryDate(Date.valueOf(expiryDate))
        .build();

    userSubscriptionRepository.save(userSubscription);

    return AddUserSubscriptionResponse.newBuilder()
        .setUserSubscription(com.subscriptionmanager.v1.proto.UserSubscription.newBuilder()
            .setName("subscriptions/" + subscription.getId())
            .setDisplayName(subscription.getName())
            .setExpiryDate(com.google.type.Date.newBuilder()
                .setDay(expiryDate.getDayOfMonth())
                .setMonth(expiryDate.getMonthValue())
                .setYear(expiryDate.getYear())
                .build())
            .build())
        .build();
  }

  @Override
  public RenewUserSubscriptionResponse renewUserSubscription(final RenewUserSubscriptionRequest request) {
    Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), "users");

    final User user = userRepositoryService.findById(parentResourceValueMap.get("users"));

    Map<String, String> nameResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getName(), "subscriptions");

    final Subscription subscription =
        subscriptionRepositoryService.findById(nameResourceValueMap.get("subscriptions"));

    final UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> ResourceNotFoundException.builder()
            .resourceName("UserSubscription")
            .fieldName("Mapping")
            .fieldValue(subscription.toString() + user.toString())
            .build()
        );

    final LocalDate expiryDate = userSubscription.getExpiryDate()
        .toLocalDate()
        .plusDays(subscription.getValidity());

    userSubscription.setExpiryDate(Date.valueOf(expiryDate));

    userSubscriptionRepository.save(userSubscription);

    return RenewUserSubscriptionResponse.newBuilder()
        .setUserSubscription(com.subscriptionmanager.v1.proto.UserSubscription.newBuilder()
            .setName("subscriptions/" + subscription.getId())
            .setDisplayName(subscription.getName())
            .setExpiryDate(com.google.type.Date.newBuilder()
                .setDay(expiryDate.getDayOfMonth())
                .setMonth(expiryDate.getMonthValue())
                .setYear(expiryDate.getYear())
                .build())
            .build())
        .build();
  }

  @Override
  public RemoveUserSubscriptionResponse removeUserSubscription(final RemoveUserSubscriptionRequest request) {
    Map<String, String> variableValueMap =
        validationService.validateAndExtractResourceValueMap(request.getName(), "users",
            "subscriptions");

    final User user = userRepositoryService.findById(variableValueMap.get("users"));

    final Subscription subscription =
        subscriptionRepositoryService.findById(variableValueMap.get("subscriptions"));

    final UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> ResourceNotFoundException.builder()
            .resourceName("UserSubscription")
            .fieldValue(subscription.toString() + user.toString())
            .build()
        );

    final LocalDate expiryDate = userSubscription.getExpiryDate().toLocalDate();

    userSubscriptionRepository.delete(userSubscription);

    return RemoveUserSubscriptionResponse.newBuilder()
        .setUserSubscription(com.subscriptionmanager.v1.proto.UserSubscription.newBuilder()
            .setName("subscriptions/" + subscription.getId())
            .setDisplayName(subscription.getName())
            .setExpiryDate(com.google.type.Date.newBuilder()
                .setDay(expiryDate.getDayOfMonth())
                .setMonth(expiryDate.getMonthValue())
                .setYear(expiryDate.getYear())
                .build())
            .build())
        .build();
  }

}
