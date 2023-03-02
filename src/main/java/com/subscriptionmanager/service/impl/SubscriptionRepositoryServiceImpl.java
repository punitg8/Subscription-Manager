package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.Cache.SUBSCRIPTION_CACHE;
import static com.subscriptionmanager.constants.Resources.SUBSCRIPTIONS;

import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.repository.SubscriptionRepository;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class SubscriptionRepositoryServiceImpl implements SubscriptionRepositoryService {

  private final SubscriptionRepository subscriptionRepository;

  @Override
  @Cacheable(key = "#id", value = SUBSCRIPTION_CACHE)
  public Subscription findById(final String id) {
    return subscriptionRepository.findById(id)
        .orElseThrow(
            () -> ResourceNotFoundException.builder()
                .resourceName(SUBSCRIPTIONS)
                .fieldName("id")
                .fieldValue(id)
                .build()
        );
  }

  @Override
  @CachePut(key = "#subscription.getId()", value = SUBSCRIPTION_CACHE)
  public Subscription save(final Subscription subscription) {
    return subscriptionRepository.save(subscription);
  }

  @Override
  public List<Subscription> findAll() {
    return subscriptionRepository.findAll();
  }

}
