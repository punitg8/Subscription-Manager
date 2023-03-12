package com.subscriptionmanager.service;

import com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse;

public interface UserSubscriptionService {

  ListUserSubscriptionsResponse listUserSubscriptions(ListUserSubscriptionsRequest request);

  AddUserSubscriptionResponse addUserSubscription(AddUserSubscriptionRequest request);

  RenewUserSubscriptionResponse renewUserSubscription(RenewUserSubscriptionRequest request);

  RemoveUserSubscriptionResponse removeUserSubscription(RemoveUserSubscriptionRequest request);

}
