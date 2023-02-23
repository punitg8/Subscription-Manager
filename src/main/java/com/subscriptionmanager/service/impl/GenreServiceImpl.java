package com.subscriptionmanager.service.impl;

import com.subscription.proto.CreateGenreRequest;
import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.service.GenreRepositoryService;
import com.subscriptionmanager.service.GenreService;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import com.subscriptionmanager.validations.ValidationService;
import com.subscriptionmanager.validations.impl.ValidationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

  private final SubscriptionRepositoryService subscriptionRepositoryService;

  private final GenreRepositoryService genreRepositoryService;

  private final ValidationService validationService;

  @Override
  public com.subscription.proto.Genre createGenre(final CreateGenreRequest request) {
    final com.subscription.proto.Genre genreDetails = request.getGenre();
    final String subscriptionUid = genreDetails.getSubscriptionUid();

    final Subscription subscription = subscriptionRepositoryService.findById(subscriptionUid);

    Genre genre = Genre.builder()
        .name(genreDetails.getName())
        .subscription(subscription)
        .build();

    validationService.validateObj(genre);

    genre = genreRepositoryService.save(genre);

    return com.subscription.proto.Genre.newBuilder()
        .setId(genre.getId())
        .setName(genre.getName())
        .setSubscriptionUid(genre.getSubscription().getId())
        .build();
  }

}
