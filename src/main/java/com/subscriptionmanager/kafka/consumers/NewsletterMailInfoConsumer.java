package com.subscriptionmanager.kafka.consumers;


import com.subscriptionmanager.v1.proto.NewsletterMailInfo;

public interface NewsletterMailInfoConsumer {

  void recieveMessage(NewsletterMailInfo info);

}
