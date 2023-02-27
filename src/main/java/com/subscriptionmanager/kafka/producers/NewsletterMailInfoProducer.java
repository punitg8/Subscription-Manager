package com.subscriptionmanager.kafka.producers;

import com.subscriptionmanager.v1.proto.NewsletterMailInfo;

public interface NewsletterMailInfoProducer {

  void sendMessage(NewsletterMailInfo info);

}
