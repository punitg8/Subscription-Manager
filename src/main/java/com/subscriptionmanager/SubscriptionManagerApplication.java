package com.subscriptionmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SubscriptionManagerApplication {

  public static void main(final String[] args) {
    SpringApplication.run(SubscriptionManagerApplication.class, args);
  }

}
