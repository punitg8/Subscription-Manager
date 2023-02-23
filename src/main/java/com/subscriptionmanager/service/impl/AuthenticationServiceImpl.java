package com.subscriptionmanager.service.impl;

import com.subscription.proto.CreateUserRequest;
import com.subscriptionmanager.enums.Role;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.repository.UserRepository;
import com.subscriptionmanager.service.AuthenticationService;
import com.subscriptionmanager.validations.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

  private final UserRepository userRepository;

  private final ValidationService validationService;


  @Override
  public com.subscription.proto.User createUser(CreateUserRequest request) {
    com.subscription.proto.User newUser = request.getUser();

    User user = com.subscriptionmanager.model.User.builder()
        .name(newUser.getName())
        .emailId(newUser.getEmailId())
        .password(newUser.getPassword())
        .role(Role.valueOf(newUser.getRole().toString()))
        .build();

    validationService.validateObj(user);

    user = userRepository.save(user);

    return com.subscription.proto.User.newBuilder()
        .setId(user.getId())
        .setName(user.getName())
        .setEmailId(user.getEmailId())
        .setPassword(user.getPassword())
        .setRole(com.subscription.proto.User.Role.valueOf(user.getRole().toString()))
        .build();
  }

}
