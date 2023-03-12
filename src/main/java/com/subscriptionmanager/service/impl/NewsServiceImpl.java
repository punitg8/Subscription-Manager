package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.Resources.GENRES;
import static com.subscriptionmanager.constants.Resources.NEWS;

import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.News;
import com.subscriptionmanager.repository.NewsRepository;
import com.subscriptionmanager.service.GenreRepositoryService;
import com.subscriptionmanager.service.NewsService;
import com.subscriptionmanager.v1.proto.CreateNewsRequest;
import com.subscriptionmanager.validations.ValidationService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NewsServiceImpl implements NewsService {

  private final GenreRepositoryService genreRepositoryService;

  private final NewsRepository newsRepository;

  private final ValidationService validationService;

  @Override
  public com.subscriptionmanager.v1.proto.News createNews(final CreateNewsRequest request) {
    final Map<String, String> parentResourceValueMap =
        validationService.validateAndExtractResourceValueMap(request.getParent(), GENRES);

    final String genreId = parentResourceValueMap.get(GENRES);

    final com.subscriptionmanager.v1.proto.News newNews = request.getNews();

    final Genre genre = genreRepositoryService.findById(genreId);

    News news = News.builder()
        .genre(genre)
        .title(newNews.getTitle())
        .description(newNews.getDescription())
        .build();

    validationService.validateObj(news);

    news = newsRepository.save(news);

    return com.subscriptionmanager.v1.proto.News.newBuilder()
        .setName(NEWS.concat("/").concat(news.getId()))
        .setTitle(news.getTitle())
        .setDescription(news.getDescription())
        .build();
  }

}
