package com.subscriptionmanager.service.impl;

import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.service.GenreRepositoryService;
import com.subscriptionmanager.service.GenreService;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import com.subscriptionmanager.v1.proto.CreateGenreRequest;
import com.subscriptionmanager.validations.ValidationService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

  private final SubscriptionRepositoryService subscriptionRepositoryService;

  private final GenreRepositoryService genreRepositoryService;

  private final ValidationService validationService;

  @Override
  public com.subscriptionmanager.v1.proto.Genre createGenre(final CreateGenreRequest request) {
    Map<String, String> parentVariableValueMap =
        validationService.validateAndExtractVariableValue(request.getParent(), "subscriptions");

    final String subscriptionId = parentVariableValueMap.get("subscriptions");

    final com.subscriptionmanager.v1.proto.Genre  genreDetails = request.getGenre();

    final Subscription subscription = subscriptionRepositoryService.findById(subscriptionId);

    Genre genre = Genre.builder()
        .name(genreDetails.getDisplayName())
        .subscription(subscription)
        .build();

    validationService.validateObj(genre);

    genre = genreRepositoryService.save(genre);

    return com.subscriptionmanager.v1.proto.Genre.newBuilder()
        .setName("genres/" + genre.getId())
        .setDisplayName(genre.getName())
        .build();
  }

}
