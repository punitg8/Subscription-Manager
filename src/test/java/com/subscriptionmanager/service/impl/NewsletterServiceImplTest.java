package com.subscriptionmanager.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.subscription.proto.Newsletter;
import com.subscription.proto.NewsletterMailInfo;
import com.subscriptionmanager.kafka.producers.NewsletterMailInfoProducer;
import com.subscriptionmanager.model.Subscription;
import com.subscriptionmanager.repository.NewsRepository;
import com.subscriptionmanager.repository.UserSubscriptionRepository;
import com.subscriptionmanager.service.GenreRepositoryService;
import com.subscriptionmanager.service.SubscriptionRepositoryService;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NewsletterServiceImplTest {

  @Mock
  SubscriptionRepositoryService subscriptionRepositoryServiceMock;

  @Mock
  GenreRepositoryService genreRepositoryServiceMock;

  @Mock
  NewsRepository newsRepositoryMock;

  @Mock
  UserSubscriptionRepository userSubscriptionRepositoryMock;

  @Mock
  NewsletterMailInfoProducer newsletterMailInfoProducerMock;

  @Mock
  Subscription subscription;

  @InjectMocks
  NewsletterServiceImpl serviceMock;

  @Test
  void testGenerateNewsletterMailInfo() {
    List<Subscription> subscriptionList = new ArrayList<>();

    subscriptionList.add(subscription);
    subscriptionList.add(subscription);

    doNothing().when(newsletterMailInfoProducerMock).sendMessage(isA(NewsletterMailInfo.class));

    doReturn(subscriptionList).when(subscriptionRepositoryServiceMock).findAll();

    serviceMock.generateNewsletterMailInfo();

    verify(newsletterMailInfoProducerMock, times(2)).sendMessage(isA(NewsletterMailInfo.class));
  }

}