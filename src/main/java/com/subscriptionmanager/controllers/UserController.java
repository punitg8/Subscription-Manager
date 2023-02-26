package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.UserServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.UserService;
import com.subscriptionmanager.v1.proto.AddSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse;
import com.subscriptionmanager.v1.proto.RenewSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RenewSubscriptionResponse;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class UserController extends UserServiceGrpc.UserServiceImplBase {

  private final UserService userService;

  @Override
  public void listSubscription(final ListSubscriptionsRequest request,
                               final StreamObserver<ListSubscriptionsResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.listSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void addSubscription(final AddSubscriptionRequest request,
                              final StreamObserver<AddSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.addSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void renewSubscription(final RenewSubscriptionRequest request,
                                final StreamObserver<RenewSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.renewSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void removeSubscription(final RemoveSubscriptionRequest request,
                                 final StreamObserver<RemoveSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userService.deleteSubscription(request));
      responseObserver.onCompleted();

    } catch (ResourceNotFoundException exception) {
      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (InvalidArgumentException exception) {
      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (Exception exception) {
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

}
