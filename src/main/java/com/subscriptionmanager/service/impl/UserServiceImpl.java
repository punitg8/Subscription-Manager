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
import com.subscriptionmanager.v1.proto.AddSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewSubscriptionResponse;
import com.subscriptionmanager.validations.ValidationService;
import java.sql.Date;
import java.time.LocalDate;
import java.util.stream.Collectors;
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
  public ListSubscriptionsResponse listSubscriptions(final ListSubscriptionsRequest request) {
    final User user = userRepositoryService.findById(request.getParent().split("/")[1]);

    final int pageToken = validationService.validateAndExtractPageToken(request.getPageToken());


    final int pageSize = validationService.validateAndExtractPageSize(request.getPageSize(),
        LIST_SUBSCRIPTIONS_MIN_PAGE_SIZE, LIST_SUBSCRIPTIONS_MAX_PAGE_SIZE);

    return ListSubscriptionsResponse.newBuilder()
        .addAllSubscription(
            userSubscriptionRepository.findAllByUser(user,
                    PageRequest.of(pageToken, pageSize))
                .stream()
                .map(userSubscription -> com.subscriptionmanager.v1.proto.Subscription.newBuilder()
                    .setName(userSubscription.getSubscription().getName())
                    .setDisplayName(userSubscription.getSubscription().getName())
                    .setValidity(userSubscription.getSubscription().getValidity())
                    .setPrice(userSubscription.getSubscription().getPrice())
                    .build()
                )
                .toList()
        )
        .setNextPageToken(Integer.toString(pageToken + 1))
        .build();
  }

  @Override
  public AddSubscriptionResponse addSubscription(final AddSubscriptionRequest request) {
    final User user = userRepositoryService.findById(request.getParent().split("/")[1]);

    final Subscription subscription =
        subscriptionRepositoryService.findById(request.getName().split("/")[1]);

    if (userSubscriptionRepository.existsByUserAndSubscription(user, subscription)) {
      throw InvalidArgumentException.builder()
          .violationMessage(DUPLICATE_VALUE_EXCEPTION)
          .fieldValue(subscription.toString())
          .build();
    }

    Date expiryDate = Date.valueOf(LocalDate.now().plusDays(subscription.getValidity()));

    final UserSubscription userSubscription = UserSubscription.builder()
        .user(user)
        .subscription(subscription)
        .expiryDate(expiryDate)
        .build();

    userSubscriptionRepository.save(userSubscription);

    return AddSubscriptionResponse.newBuilder()
        .setSubscription(com.subscriptionmanager.v1.proto.Subscription.newBuilder()
            .setName(subscription.getId())
            .setDisplayName(subscription.getName())
            .setValidity(subscription.getValidity())
            .setPrice(subscription.getPrice())
            .build())
        .setExpiryDate(com.google.type.Date.newBuilder()
            .setDay(expiryDate.getDay())
            .setMonth(expiryDate.getMonth())
            .setYear(expiryDate.getYear())
            .build())
        .build();
  }

  @Override
  public RenewSubscriptionResponse renewSubscription(final RenewSubscriptionRequest request) {
    final User user = userRepositoryService.findById(request.getParent().split("/")[1]);

    final Subscription subscription =
        subscriptionRepositoryService.findById(request.getName().split("/")[1]);

    final UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> ResourceNotFoundException.builder()
            .resourceName("UserSubscription")
            .fieldValue(subscription.toString() + user.toString())
            .build()
        );

    Date expiryDate = Date.valueOf(LocalDate.now().plusDays(subscription.getValidity()));

    userSubscription.setExpiryDate(expiryDate);

    userSubscriptionRepository.save(userSubscription);

    return RenewSubscriptionResponse.newBuilder()
        .setSubscription(com.subscriptionmanager.v1.proto.Subscription.newBuilder()
            .setName(subscription.getId())
            .setDisplayName(subscription.getName())
            .setValidity(subscription.getValidity())
            .setPrice(subscription.getPrice())
            .build())
        .setExpiryDate(com.google.type.Date.newBuilder()
            .setDay(expiryDate.getDay())
            .setMonth(expiryDate.getMonth())
            .setYear(expiryDate.getYear())
            .build())
        .build();
  }

  @Override
  public RemoveSubscriptionResponse removeSubscription(final RemoveSubscriptionRequest request) {
    final User user = userRepositoryService.findById(request.getParent().split("/")[1]);

    final Subscription subscription =
        subscriptionRepositoryService.findById(request.getName().split("/")[1]);

    final UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> ResourceNotFoundException.builder()
            .resourceName("UserSubscription")
            .fieldValue(subscription.toString() + user.toString())
            .build()
        );

    userSubscriptionRepository.delete(userSubscription);

    return RemoveSubscriptionResponse.newBuilder()
        .setSubscription(com.subscriptionmanager.v1.proto.Subscription.newBuilder()
            .setName(subscription.getId())
            .setDisplayName(subscription.getName())
            .setValidity(subscription.getValidity())
            .setPrice(subscription.getPrice())
            .build())
        .build();
  }

}
