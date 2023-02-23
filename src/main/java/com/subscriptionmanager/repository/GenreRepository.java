package com.subscriptionmanager.repository;

import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.Subscription;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,String> {

  List<Genre> findBySubscription (Subscription subscription);

}
