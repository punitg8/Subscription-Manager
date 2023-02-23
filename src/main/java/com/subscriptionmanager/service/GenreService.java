package com.subscriptionmanager.service;

import com.subscription.proto.CreateGenreRequest;
import com.subscription.proto.Genre;

public interface GenreService {

  Genre createGenre(CreateGenreRequest request);

}
