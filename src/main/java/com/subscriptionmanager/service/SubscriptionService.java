package com.subscriptionmanager.service;


import com.subscriptionmanager.v1.proto.CreateSubscriptionRequest;
import com.subscriptionmanager.v1.proto.Subscription;

public interface SubscriptionService {

  Subscription createSubscription(CreateSubscriptionRequest request);

}
