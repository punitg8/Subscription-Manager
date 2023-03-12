package com.subscriptionmanager.service;

import com.subscriptionmanager.v1.proto.CreateGenreRequest;
import com.subscriptionmanager.v1.proto.Genre;

public interface GenreService {

  Genre createGenre(CreateGenreRequest request);

}
