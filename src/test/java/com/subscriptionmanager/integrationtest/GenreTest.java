package com.subscriptionmanager.integrationtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.subscription.v1.proto.GenreServiceGrpc;
import com.subscription.v1.proto.SubscriptionServiceGrpc;
import com.subscriptionmanager.v1.proto.CreateGenreRequest;
import com.subscriptionmanager.v1.proto.CreateSubscriptionRequest;
import com.subscriptionmanager.v1.proto.Genre;
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
public class GenreTest {

  private static ManagedChannel channel;
  private static SubscriptionServiceGrpc.SubscriptionServiceBlockingStub subscriptionServiceStub;
  private static GenreServiceGrpc.GenreServiceBlockingStub genreServiceStub;
 //
  @BeforeAll
  static void setup() {
    channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();

    genreServiceStub = GenreServiceGrpc.newBlockingStub(channel);
    subscriptionServiceStub = SubscriptionServiceGrpc.newBlockingStub(channel);
  }

  @Test
  void testCreateGenreHappyPath(){
    String randomSubscriptionName = "TEST::SUBSCRIPTION::" + UUID.randomUUID();
    Subscription subscription = subscriptionServiceStub.createSubscription(
        CreateSubscriptionRequest.newBuilder()
            .setSubscription(Subscription.newBuilder()
                .setDisplayName(randomSubscriptionName)
                .setPrice(100)
                .setValidity(10)
            ).build()
    );

    String randomGenreName = "TEST::GENRE::" + UUID.randomUUID();
    Genre genre = genreServiceStub.createGenre(
        CreateGenreRequest.newBuilder()
            .setParent(subscription.getName())
            .setGenre(
                Genre.newBuilder()
                    .setDisplayName(randomGenreName)
                    .build()
            ).build()
    );

    assertNotNull(genre.getName());
    assertEquals(randomGenreName,genre.getDisplayName(),"Create genre");
  }

  @AfterAll
  static void cleanUp(){
    channel.shutdown();
  }
}
