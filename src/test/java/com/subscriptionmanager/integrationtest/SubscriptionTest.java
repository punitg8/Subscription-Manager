package com.subscriptionmanager.integrationtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.subscription.v1.proto.SubscriptionServiceGrpc;
import com.subscriptionmanager.v1.proto.CreateSubscriptionRequest;
import com.subscriptionmanager.v1.proto.Subscription;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.UUID;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SubscriptionTest {

  private static ManagedChannel channel;
  private static SubscriptionServiceGrpc.SubscriptionServiceBlockingStub subscriptionServiceStub;

  @BeforeAll
  static void setup() {
    channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();

    subscriptionServiceStub = SubscriptionServiceGrpc.newBlockingStub(channel);
  }
  @Test
  void testCreateSubscriptionHappyPath(){
    String randomSubscriptionName = "TEST::SUBSCRIPTION::" + UUID.randomUUID();
    Subscription subscription = subscriptionServiceStub.createSubscription(
        CreateSubscriptionRequest.newBuilder()
            .setSubscription(Subscription.newBuilder()
                .setDisplayName(randomSubscriptionName)
                .setPrice(100)
                .setValidity(10)
            ).build()
    );

    assertEquals(randomSubscriptionName,subscription.getDisplayName(),"Create Subscription Test");
    assertNotNull(subscription.getName());
  }

  @AfterAll
  static void cleanUp(){
    channel.shutdown();
  }
}
