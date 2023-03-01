package com.subscriptionmanager.service.impl;

import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.repository.UserRepository;
import com.subscriptionmanager.service.UserRepositoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {

  private final UserRepository userRepository;

  @Override
  public User findById(String id) {
    return userRepository.findById(id)
        .orElseThrow(
            () -> ResourceNotFoundException.builder()
                .resourceName("User")
                .fieldName("id")
                .fieldValue(id)
                .build()
        );
  }

  @Override
  public User save(User user){
    return userRepository.save(user);
  }

}
