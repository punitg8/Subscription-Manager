package com.subscriptionmanager.service;

import com.subscriptionmanager.v1.proto.AddSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewSubscriptionResponse;

public interface UserService {

  ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request);

  AddSubscriptionResponse addSubscription(AddSubscriptionRequest request);

  RenewSubscriptionResponse renewSubscription(RenewSubscriptionRequest request);

  RemoveSubscriptionResponse removeSubscription(RemoveSubscriptionRequest request);

}
