package com.subscriptionmanager.service.impl;

import com.subscription.proto.CreateSubscriptionRequest;
import com.subscription.proto.Subscription;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import com.subscriptionmanager.service.SubscriptionService;
import com.subscriptionmanager.validations.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SubscriptionServiceImpl implements SubscriptionService {

  private final SubscriptionRepositoryService subscriptionRepositoryService;

  private final ValidationService validationService;


  @Override
  public Subscription createSubscription(final CreateSubscriptionRequest request) {
    final Subscription newSubscription = request.getSubscription();

    com.subscriptionmanager.model.Subscription subscription =
        com.subscriptionmanager.model.Subscription.builder()
            .name(newSubscription.getName())
            .price(newSubscription.getPrice())
            .validity(newSubscription.getValidity())
            .build();

    validationService.validateObj(subscription);

    subscription = subscriptionRepositoryService.save(subscription);

    return Subscription.newBuilder()
        .setId(subscription.getId())
        .setName(subscription.getName())
        .setPrice(subscription.getPrice())
        .setValidity(subscription.getValidity())
        .build();

  }

}
