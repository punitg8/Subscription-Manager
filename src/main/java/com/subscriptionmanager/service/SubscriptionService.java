package com.subscriptionmanager.service;

import com.subscription.proto.CreateSubscriptionRequest;
import com.subscription.proto.Subscription;

public interface SubscriptionService {

  Subscription createSubscription(CreateSubscriptionRequest request);

}
