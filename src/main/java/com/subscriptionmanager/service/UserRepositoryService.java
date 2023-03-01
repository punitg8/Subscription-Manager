package com.subscriptionmanager.service;

import com.subscriptionmanager.model.User;

public interface UserRepositoryService {

  User findById(String id);

  User save(User user);
}
