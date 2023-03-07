package com.subscriptionmanager.integrationtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.subscription.v1.proto.AuthenticationServiceGrpc;
import com.subscription.v1.proto.SubscriptionServiceGrpc;
import com.subscription.v1.proto.UserServiceGrpc;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.CreateSubscriptionRequest;
import com.subscriptionmanager.v1.proto.CreateUserRequest;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.Subscription;
import com.subscriptionmanager.v1.proto.User;
import com.subscriptionmanager.v1.proto.UserSubscription;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.time.LocalDate;
import java.util.List;
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
public class UserTest {

  private static ManagedChannel channel;
  private static AuthenticationServiceGrpc.AuthenticationServiceBlockingStub
      authenticationServiceStub;
  private static UserServiceGrpc.UserServiceBlockingStub userServiceStub;
  private static SubscriptionServiceGrpc.SubscriptionServiceBlockingStub subscriptionServiceStub;

  @BeforeAll
  static void setup() {
    channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();

    authenticationServiceStub = AuthenticationServiceGrpc.newBlockingStub(channel);
    userServiceStub = UserServiceGrpc.newBlockingStub(channel);
    subscriptionServiceStub = SubscriptionServiceGrpc.newBlockingStub(channel);
  }

  User createUser() {
    String randomUserName = "TEST::USER::" + UUID.randomUUID();
    String randomUserEmailId = "TEST::EMAIL::" + UUID.randomUUID();
    return authenticationServiceStub.createUser(
        CreateUserRequest.newBuilder()
            .setUser(User.newBuilder()
                .setDisplayName(randomUserName)
                .setPassword("password")
                .setRole(User.Role.ROLE_USER)
                .setEmailId(randomUserEmailId)
            ).build()
    );
  }

  Subscription createSubscription() {
    String randomSubscriptionName = "TEST::SUBSCRIPTION::" + UUID.randomUUID();
    return subscriptionServiceStub.createSubscription(
        CreateSubscriptionRequest.newBuilder()
            .setSubscription(Subscription.newBuilder()
                .setDisplayName(randomSubscriptionName)
                .setPrice(100)
                .setValidity(10)
            ).build()
    );
  }

  @Test
  void testAddUserSubscriptionHappyPath() {
    User user = createUser();
    Subscription subscription = createSubscription();

    UserSubscription userSubscription = userServiceStub.addUserSubscription(
        AddUserSubscriptionRequest.newBuilder()
            .setParent(user.getName())
            .setName(subscription.getName())
            .build()
    ).getUserSubscription();

    assertEquals(subscription.getDisplayName(), userSubscription.getDisplayName(),
        "Add new subscription");
  }

  @Test
  void testRenewUserSubscriptionHappyPath() {
    User user = createUser();
    Subscription subscription = createSubscription();

    userServiceStub.addUserSubscription(
        AddUserSubscriptionRequest.newBuilder()
            .setParent(user.getName())
            .setName(subscription.getName())
            .build()
    );

    UserSubscription userSubscription = userServiceStub.renewUserSubscription(
        RenewUserSubscriptionRequest.newBuilder()
            .setParent(user.getName())
            .setName(subscription.getName())
            .build()
    ).getUserSubscription();

    LocalDate expectedExpiryDate = LocalDate.now().plusDays(2L * subscription.getValidity());

    assertEquals(expectedExpiryDate.getDayOfMonth(),
        userSubscription.getExpiryDate().getDay(),
        "Renew new subscription");
  }

  @Test
  void testRemoveUserSubscriptionHappyPath() {
    User user = createUser();
    Subscription subscription = createSubscription();

    userServiceStub.addUserSubscription(
        AddUserSubscriptionRequest.newBuilder()
            .setParent(user.getName())
            .setName(subscription.getName())
            .build()
    );

    userServiceStub.removeUserSubscription(
        RemoveUserSubscriptionRequest.newBuilder()
            .setName(user.getName().concat("/").concat(subscription.getName()))
            .build()
    );

    List<UserSubscription> subscriptionList = userServiceStub.listUserSubscriptions(
        ListUserSubscriptionsRequest.newBuilder()
            .setParent(user.getName())
            .build()
    ).getUserSubscriptionList();

    assertEquals(0,subscriptionList.size(),"Remove subscription");
  }

  @Test
  void testListUserSubscriptionHappyPath() {
    User user = createUser();
    Subscription subscription = createSubscription();

    userServiceStub.addUserSubscription(
        AddUserSubscriptionRequest.newBuilder()
            .setParent(user.getName())
            .setName(subscription.getName())
            .build()
    );

    List<UserSubscription> subscriptionList = userServiceStub.listUserSubscriptions(
        ListUserSubscriptionsRequest.newBuilder()
            .setParent(user.getName())
            .build()
    ).getUserSubscriptionList();

    assertEquals(1,subscriptionList.size(),"List subscription");
  }

  @AfterAll
  static void cleanUp(){
    channel.shutdown();
  }
}
