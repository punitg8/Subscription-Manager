package com.subscriptionmanager.service;

import com.subscription.proto.AddSubscriptionRequest;
import com.subscription.proto.AddSubscriptionResponse;
import com.subscription.proto.DeleteSubscriptionRequest;
import com.subscription.proto.DeleteSubscriptionResponse;
import com.subscription.proto.ListSubscriptionRequest;
import com.subscription.proto.ListSubscriptionResponse;
import com.subscription.proto.RenewSubscriptionRequest;
import com.subscription.proto.RenewSubscriptionResponse;

public interface UserService {
  ListSubscriptionResponse listSubscription(ListSubscriptionRequest request);

  AddSubscriptionResponse addSubscription(AddSubscriptionRequest request);

  RenewSubscriptionResponse renewSubscription(RenewSubscriptionRequest request);

  DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request);
}
