package com.subscriptionmanager.kafka.serializer;

import com.subscription.proto.NewsletterMailInfo;
import org.apache.kafka.common.serialization.Serializer;

public class NewsletterMailInfoSerializer implements Serializer<NewsletterMailInfo> {

  @Override
  public byte[] serialize(final String topic, final NewsletterMailInfo data) {
    return data.toByteArray();
  }

}
