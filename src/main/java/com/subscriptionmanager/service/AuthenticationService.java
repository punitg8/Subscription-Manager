package com.subscriptionmanager.service;

import com.subscription.proto.CreateUserRequest;
import com.subscription.proto.User;

public interface AuthenticationService {

  User createUser(CreateUserRequest request);

}
