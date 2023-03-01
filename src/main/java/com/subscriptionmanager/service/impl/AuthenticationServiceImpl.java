package com.subscriptionmanager.service.impl;

import com.subscriptionmanager.enums.Role;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.service.AuthenticationService;
import com.subscriptionmanager.service.UserRepositoryService;
import com.subscriptionmanager.v1.proto.CreateUserRequest;
import com.subscriptionmanager.validations.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

  private final UserRepositoryService userRepositoryService;

  private final ValidationService validationService;


  @Override
  public com.subscriptionmanager.v1.proto.User createUser(final CreateUserRequest request) {
    final com.subscriptionmanager.v1.proto.User newUser = request.getUser();

    User user = User.builder()
        .name(newUser.getDisplayName())
        .emailId(newUser.getEmailId())
        .password(newUser.getPassword())
        .role(Role.valueOf(newUser.getRole().toString()))
        .build();

    validationService.validateObj(user);

    user = userRepositoryService.save(user);

    return com.subscriptionmanager.v1.proto.User.newBuilder()
        .setName(user.getId())
        .setDisplayName(user.getName())
        .setEmailId(user.getEmailId())
        .setPassword(user.getPassword())
        .setRole(com.subscriptionmanager.v1.proto.User.Role.valueOf(user.getRole().toString()))
        .build();
  }

}
