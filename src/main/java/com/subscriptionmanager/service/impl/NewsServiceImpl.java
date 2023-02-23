package com.subscriptionmanager.service.impl;

import com.subscription.proto.CreateNewsRequest;
import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.News;
import com.subscriptionmanager.repository.NewsRepository;
import com.subscriptionmanager.service.GenreRepositoryService;
import com.subscriptionmanager.service.NewsService;
import com.subscriptionmanager.validations.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NewsServiceImpl implements NewsService {

  private final GenreRepositoryService genreRepositoryService;

  private final NewsRepository newsRepository;

  private final ValidationService validationService;

  @Override
  public com.subscription.proto.News createNews(final CreateNewsRequest request) {
    final com.subscription.proto.News newNews = request.getNews();
    final String genreUid = newNews.getGenreUid();

    final Genre genre = genreRepositoryService.findById(genreUid);

    News news = News.builder()
        .genre(genre)
        .title(newNews.getTitle())
        .description(newNews.getDescription())
        .build();

    validationService.validateObj(news);

    news = newsRepository.save(news);

    return com.subscription.proto.News.newBuilder()
        .setId(news.getId())
        .setGenreUid(news.getGenre().getId())
        .setTitle(news.getTitle())
        .setDescription(news.getDescription())
        .build();
  }

}
