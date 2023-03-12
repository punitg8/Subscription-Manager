package com.subscriptionmanager.repository;

import com.subscriptionmanager.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

}
