package com.subscriptionmanager.kafka.consumers.impl;

import com.subscription.proto.NewsletterMailInfo;
import com.subscriptionmanager.kafka.consumers.NewsletterMailInfoConsumer;
import com.subscriptionmanager.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Log4j2
public class NewsletterMailInfoConsumerImpl implements NewsletterMailInfoConsumer {

  private final EmailService emailService;

  @Override
  @KafkaListener(topics = "${spring.kafka.topic.name}",
      groupId = "${spring.kafka.consumer.group-id}")
  public void recieveMessage(NewsletterMailInfo info){
    log.info(info.toString());
    emailService.sendNewsletterEmail(info);
  }

}
