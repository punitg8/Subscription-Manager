package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.UserServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.UserService;
import com.subscriptionmanager.v1.proto.AddSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddSubscriptionResponse;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;

@Log4j2
@RequiredArgsConstructor
@GRpcService
public class UserController extends UserServiceGrpc.UserServiceImplBase {

  private final UserService userService;

  @Override
  public void listUserSubscriptions(final ListUserSubscriptionsRequest request,
                                final StreamObserver<ListUserSubscriptionsResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.listUserSubscriptions(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      log.error(exception.getMessage());

      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void addUserSubscription(final AddUserSubscriptionRequest request,
                              final StreamObserver<AddUserSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.addUserSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      log.error(exception.getMessage());

      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void renewUserSubscription(final RenewUserSubscriptionRequest request,
                                final StreamObserver<RenewUserSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.renewUserSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      log.error(exception.getMessage());

      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void removeUserSubscription(
      final RemoveUserSubscriptionRequest request,
      final StreamObserver<RemoveUserSubscriptionResponse> responseObserver) {

    try {

      responseObserver.onNext(userService.removeUserSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      log.error(exception.getMessage());

      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

}
