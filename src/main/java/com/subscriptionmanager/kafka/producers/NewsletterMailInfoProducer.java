package com.subscriptionmanager.kafka.producers;

import com.subscription.proto.NewsletterMailInfo;

public interface NewsletterMailInfoProducer {
  void sendMessage(NewsletterMailInfo info);
}
