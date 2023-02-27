package com.subscriptionmanager.kafka.deserializer;

import com.google.protobuf.InvalidProtocolBufferException;
import com.subscriptionmanager.v1.proto.NewsletterMailInfo;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.serialization.Deserializer;

@Log4j2
public class NewsletterMailInfoDeserializer implements Deserializer<NewsletterMailInfo> {

  @Override
  public NewsletterMailInfo deserialize(final String topic, final byte[] data) {
    NewsletterMailInfo newsletterMailInfo = null;
    try {
      newsletterMailInfo = NewsletterMailInfo.parseFrom(data);
    } catch (InvalidProtocolBufferException exception) {
      log.error(exception.getMessage());
    }
    return newsletterMailInfo;
  }

}
