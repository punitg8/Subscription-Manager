package com.subscriptionmanager.service.impl;

import static com.subscriptionmanager.constants.Newsletter.NEWSLETTER_CRON_EXPRESSION;
import static com.subscriptionmanager.constants.Newsletter.NEWS_LIMIT;

import com.subscriptionmanager.kafka.producers.NewsletterMailInfoProducer;
import com.subscriptionmanager.model.News;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.model.User;
import com.subscriptionmanager.model.UserSubscription;
import com.subscriptionmanager.repository.NewsRepository;
import com.subscriptionmanager.repository.UserSubscriptionRepository;
import com.subscriptionmanager.service.GenreRepositoryService;
import com.subscriptionmanager.service.NewsletterService;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import com.subscriptionmanager.v1.proto.Newsletter;
import com.subscriptionmanager.v1.proto.NewsletterMailInfo;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class NewsletterServiceImpl implements NewsletterService {

  private final SubscriptionRepositoryService subscriptionRepositoryService;

  private final GenreRepositoryService genreRepositoryService;

  private final NewsRepository newsRepository;

  private final UserSubscriptionRepository userSubscriptionRepository;

  private final NewsletterMailInfoProducer newsletterMailInfoProducer;

  @Override
  @Scheduled(cron = NEWSLETTER_CRON_EXPRESSION)
  public void generateNewsletterMailInfo() {
    final List<Subscription> subscriptionList = subscriptionRepositoryService.findAll();
    subscriptionList.stream().forEach(subscription -> {
      newsletterMailInfoProducer.sendMessage(
          NewsletterMailInfo.newBuilder()
              .addAllEmailId(generateEmailId(subscription))
              .setNewsletter(generateNewsletter(subscription))
              .build()
      );
    });
  }

  private List<String> generateEmailId(final Subscription subscription) {
    return userSubscriptionRepository.findBySubscription(subscription)
        .stream()
        .map(UserSubscription::getUser)
        .map(User::getEmailId)
        .toList();
  }

  private Newsletter generateNewsletter(final Subscription subscription) {
    return Newsletter.newBuilder()
        .addAllNews(generateNews(subscription))
        .build();
  }

  private List<String> generateNews(final Subscription subscription) {
    final List<News> newsList = new ArrayList<>();

    genreRepositoryService.findBySubscription(subscription)
        .forEach(genre ->
            newsList.addAll(
                newsRepository.findByGenreOrderByCreateDateTimeDesc(genre,
                    PageRequest.of(0, NEWS_LIMIT))));

    return newsList.stream()
        .map(news -> news.getTitle() + "\n" + news.getDescription()).toList();
  }

}
