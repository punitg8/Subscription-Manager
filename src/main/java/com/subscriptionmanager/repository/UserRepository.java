package com.subscriptionmanager.repository;

import com.subscriptionmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
