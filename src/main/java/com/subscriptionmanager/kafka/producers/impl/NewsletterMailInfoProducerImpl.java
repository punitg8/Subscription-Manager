package com.subscriptionmanager.kafka.producers.impl;

import com.subscription.proto.NewsletterMailInfo;
import com.subscriptionmanager.kafka.producers.NewsletterMailInfoProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NewsletterMailInfoProducerImpl implements NewsletterMailInfoProducer {

  private final KafkaTemplate<String, NewsletterMailInfo> kafkaTemplate;

  @Value("${spring.kafka.topic.name}")
  private String topic;

  @Override
  public void sendMessage(NewsletterMailInfo info) {
    kafkaTemplate.send(topic, info);
  }
}
