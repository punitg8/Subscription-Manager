package com.subscriptionmanager.repository;


import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.model.UserSubscription;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserSubscriptionRepository extends
    JpaRepository<UserSubscription, String> {

  boolean existsByUserAndSubscription(User user, Subscription subscription);

  Optional<UserSubscription> findByUserAndSubscription(User user, Subscription subscription);

  List<UserSubscription> findAllByUser(User user, Pageable pageable);

  List<UserSubscription> findBySubscription(Subscription subscription);

  @Modifying
  @Query(value = "UPDATE user_subscription SET is_active = false WHERE id=?1", nativeQuery = true)
  void disable(String id);

}
