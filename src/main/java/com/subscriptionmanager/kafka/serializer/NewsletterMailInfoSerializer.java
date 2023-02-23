package com.subscriptionmanager.kafka.serializer;

import com.subscription.proto.NewsletterMailInfo;
import org.apache.kafka.common.serialization.Serializer;

public class NewsletterMailInfoSerializer implements Serializer<NewsletterMailInfo> {

  @Override
  public byte[] serialize(String topic, NewsletterMailInfo data) {
    return data.toByteArray();
  }

}
