package com.subscriptionmanager.service;

import com.subscriptionmanager.model.Subscription;
import java.util.List;

public interface SubscriptionRepositoryService {

  Subscription findById(String id);

  Subscription save(Subscription user);

  List<Subscription> findAll();

}
