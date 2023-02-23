package com.subscriptionmanager.service.impl;

import com.subscription.proto.AddSubscriptionRequest;
import com.subscription.proto.AddSubscriptionResponse;
import com.subscription.proto.DeleteSubscriptionRequest;
import com.subscription.proto.DeleteSubscriptionResponse;
import com.subscription.proto.ListSubscriptionRequest;
import com.subscription.proto.ListSubscriptionResponse;
import com.subscription.proto.RenewSubscriptionRequest;
import com.subscription.proto.RenewSubscriptionResponse;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.model.UserSubscription;
import com.subscriptionmanager.repository.UserRepository;
import com.subscriptionmanager.repository.UserSubscriptionRepository;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import com.subscriptionmanager.service.UserService;
import java.sql.Date;
import java.time.LocalDate;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final SubscriptionRepositoryService subscriptionRepositoryService;
  private final UserSubscriptionRepository userSubscriptionRepository;

  @Override
  public ListSubscriptionResponse listSubscription(ListSubscriptionRequest request) {
    User user = findUserById(request.getUserUid());

    return ListSubscriptionResponse.newBuilder()
        .addAllSubscriptions(
            userSubscriptionRepository.findByUser(user)
                .stream()
                .map(userSubscription -> com.subscription.proto.Subscription.newBuilder()
                    .setId(userSubscription.getSubscription().getName())
                    .setName(userSubscription.getSubscription().getName())
                    .setValidity(userSubscription.getSubscription().getValidity())
                    .setPrice(userSubscription.getSubscription().getPrice())
                    .build()
                )
                .collect(Collectors.toList())
        )
        .build();
  }

  @Override
  public AddSubscriptionResponse addSubscription(AddSubscriptionRequest request) {
    User user = findUserById(request.getUserUid());

    Subscription subscription = subscriptionRepositoryService.findById(request.getSubscriptionUid());

    if (userSubscriptionRepository.existsByUserAndSubscription(user, subscription)) {
      throw InvalidArgumentException.builder()
          .violationMessage("Duplicate Value")
          .fieldValue(subscription.toString())
          .build();
    }

    UserSubscription userSubscription = UserSubscription.builder()
        .user(user)
        .subscription(subscription)
        .validitiyDate(Date.valueOf(LocalDate.now().plusDays(subscription.getValidity())))
        .build();

    userSubscriptionRepository.save(userSubscription);

    return AddSubscriptionResponse.newBuilder()
        .setAdded(true)
        .build();
  }

  @Override
  public RenewSubscriptionResponse renewSubscription(RenewSubscriptionRequest request) {
    User user = findUserById(request.getUserUid());

    Subscription subscription = subscriptionRepositoryService.findById(request.getSubscriptionUid());

    UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> InvalidArgumentException.builder()
            .violationMessage("Subscription not present")
            .fieldValue(subscription.toString())
            .build()
        );

    userSubscription.setValiditiyDate(Date.valueOf(
        userSubscription
            .getValiditiyDate()
            .toLocalDate()
            .plusDays(subscription.getValidity())
    ));

    userSubscriptionRepository.save(userSubscription);

    return RenewSubscriptionResponse.newBuilder()
        .setRenewed(true)
        .build();
  }

  @Override
  public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) {
    User user = findUserById(request.getUserUid());

    Subscription subscription = subscriptionRepositoryService.findById(request.getSubscriptionUid());

    UserSubscription userSubscription = userSubscriptionRepository
        .findByUserAndSubscription(user, subscription)
        .orElseThrow(() -> InvalidArgumentException.builder()
            .violationMessage("Subscription not present")
            .fieldValue(subscription.toString())
            .build()
        );

    userSubscriptionRepository.delete(userSubscription);

    return DeleteSubscriptionResponse.newBuilder()
        .setDeleted(true)
        .build();
  }

  public User findUserById(String id) {
    return userRepository.findById(id)
        .orElseThrow(
            () -> ResourceNotFoundException.builder()
                .resourceName("User")
                .fieldName("id")
                .fieldValue(id)
                .build()
        );
  }

}
