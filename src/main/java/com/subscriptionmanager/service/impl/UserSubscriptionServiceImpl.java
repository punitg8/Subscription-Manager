package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.ExceptionMessage.DUPLICATE_VALUE_EXCEPTION;
import static com.subscriptionmanager.constants.Resources.SUBSCRIPTIONS;
import static com.subscriptionmanager.constants.Resources.USERS;
import static com.subscriptionmanager.constants.Resources.USER_SUBSCRIPTION;
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
import com.subscriptionmanager.service.UserSubscriptionService;
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
public class UserSubscriptionServiceImpl implements UserSubscriptionService {

  private final UserRepositoryService userRepositoryService;
  private final SubscriptionRepositoryService subscriptionRepositoryService;
  private final UserSubscriptionRepository userSubscriptionRepository;
  private final ValidationService validationService;

  @Override
  public ListUserSubscriptionsResponse listUserSubscriptions(
      final ListUserSubscriptionsRequest request) {

    final Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), USERS);

    final User user = userRepositoryService.findById(parentResourceValueMap.get(USERS));

    final int pageToken = validationService.validateAndExtractPageToken(request.getPageToken());


    final int pageSize = validationService.validateAndExtractPageSize(request.getPageSize(),
        LIST_SUBSCRIPTIONS_MIN_PAGE_SIZE, LIST_SUBSCRIPTIONS_MAX_PAGE_SIZE);

    return ListUserSubscriptionsResponse.newBuilder()
        .addAllUserSubscription(
            userSubscriptionRepository.findAllByUser(user, PageRequest.of(pageToken, pageSize))
                .stream()
                .map(
                    userSubscription -> com.subscriptionmanager.v1.proto.UserSubscription.newBuilder()
                        .setName(SUBSCRIPTIONS.concat("/")
                            .concat(userSubscription.getSubscription().getId()))
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

    final Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), USERS);

    final User user = userRepositoryService.findById(parentResourceValueMap.get(USERS));

    final Map<String, String> nameResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getName(), SUBSCRIPTIONS);

    final Subscription subscription =
        subscriptionRepositoryService.findById(nameResourceValueMap.get(SUBSCRIPTIONS));

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
            .setName(SUBSCRIPTIONS.concat("/").concat(subscription.getId()))
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
  public RenewUserSubscriptionResponse renewUserSubscription(
      final RenewUserSubscriptionRequest request) {

    final Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), USERS);

    final User user = userRepositoryService.findById(parentResourceValueMap.get(USERS));

    final Map<String, String> nameResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getName(), SUBSCRIPTIONS);

    final Subscription subscription =
        subscriptionRepositoryService.findById(nameResourceValueMap.get(SUBSCRIPTIONS));

    final UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> ResourceNotFoundException.builder()
            .resourceName(USER_SUBSCRIPTION)
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
            .setName(SUBSCRIPTIONS.concat("/").concat(subscription.getId()))
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
  public RemoveUserSubscriptionResponse removeUserSubscription(
      final RemoveUserSubscriptionRequest request) {

    final Map<String, String> resourseValueMap =
        validationService.validateAndExtractResourceValueMap(request.getName(), USERS,
            SUBSCRIPTIONS);

    final User user = userRepositoryService.findById(resourseValueMap.get(USERS));

    final Subscription subscription =
        subscriptionRepositoryService.findById(resourseValueMap.get(SUBSCRIPTIONS));

    final UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> ResourceNotFoundException.builder()
            .resourceName(USER_SUBSCRIPTION)
            .fieldValue(subscription.toString() + user.toString())
            .build()
        );

    final LocalDate expiryDate = userSubscription.getExpiryDate().toLocalDate();

    userSubscriptionRepository.delete(userSubscription);

    return RemoveUserSubscriptionResponse.newBuilder()
        .setUserSubscription(com.subscriptionmanager.v1.proto.UserSubscription.newBuilder()
            .setName(SUBSCRIPTIONS.concat("/").concat(subscription.getId()))
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
