package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.Cache.GENRE_CACHE;
import static com.subscriptionmanager.constants.Resources.SUBSCRIPTIONS;

import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.repository.GenreRepository;
import com.subscriptionmanager.service.GenreRepositoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class GenreRepositoryServiceImpl implements GenreRepositoryService {

  private final GenreRepository genreRepository;

  @Override
  @Cacheable(key = "#id", value = GENRE_CACHE)
  public Genre findById(final String id) {
    return genreRepository.findById(id)
        .orElseThrow(
            () -> ResourceNotFoundException.builder()
                .resourceName(SUBSCRIPTIONS)
                .fieldName("id")
                .fieldValue(id)
                .build()
        );
  }

  @Override
  @CachePut(key = "#genre.getId()", value = GENRE_CACHE)
  public Genre save(final Genre genre) {
    return genreRepository.save(genre);
  }

  @Override
  public List<Genre> findBySubscription(final Subscription subscription) {
    return genreRepository.findBySubscription(subscription);
  }

}