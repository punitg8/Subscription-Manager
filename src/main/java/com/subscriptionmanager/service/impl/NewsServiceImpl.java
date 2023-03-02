package com.subscriptionmanager.service.impl;

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
    Map<String, String> parentVariableValueMap =
        validationService.validateAndExtractVariableValue(request.getParent(), "genres");

    final String genreId = parentVariableValueMap.get("genres");

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
        .setName("news/" + news.getId())
        .setTitle(news.getTitle())
        .setDescription(news.getDescription())
        .build();
  }

}
