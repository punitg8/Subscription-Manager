package com.subscriptionmanager.service;


import com.subscriptionmanager.v1.proto.CreateUserRequest;
import com.subscriptionmanager.v1.proto.User;

public interface AuthenticationService {

  User createUser(CreateUserRequest request);

}
