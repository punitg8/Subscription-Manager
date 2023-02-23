package com.subscriptionmanager.kafka.consumers;

import com.subscription.proto.NewsletterMailInfo;

public interface NewsletterMailInfoConsumer {

  void recieveMessage(NewsletterMailInfo info);

}
