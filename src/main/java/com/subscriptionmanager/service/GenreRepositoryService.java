package com.subscriptionmanager.service;

import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.Subscription;
import java.util.List;

public interface GenreRepositoryService {
  Genre findById(String id);
  Genre save(Genre genre);
  List<Genre> findBySubscription(Subscription subscription);
}
