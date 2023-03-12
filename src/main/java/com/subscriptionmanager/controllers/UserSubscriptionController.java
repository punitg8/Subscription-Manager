package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.UserSubscriptionServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.UserSubscriptionService;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest;
import com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest;
import com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse;
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
public class UserSubscriptionController extends UserSubscriptionServiceGrpc.UserSubscriptionServiceImplBase {

  private final UserSubscriptionService userSubscriptionService;

  @Override
  public void listUserSubscriptions(final ListUserSubscriptionsRequest request,
                                final StreamObserver<ListUserSubscriptionsResponse> responseObserver) {
    try {

      responseObserver.onNext(userSubscriptionService.listUserSubscriptions(request));
      responseObserver.onCompleted();

    } catch (final ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final Exception exception) {
      log.error(exception.getMessage().concat(" for user ").concat(request.getParent()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for user ")
                  .concat(request.getParent()))
          .asRuntimeException());
    }
  }

  @Override
  public void addUserSubscription(final AddUserSubscriptionRequest request,
                              final StreamObserver<AddUserSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userSubscriptionService.addUserSubscription(request));
      responseObserver.onCompleted();

    } catch (final ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final Exception exception) {
      log.error(exception.getMessage().concat(" for user ").concat(request.getParent()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for user ")
                  .concat(request.getParent()))
          .asRuntimeException());
    }
  }

  @Override
  public void renewUserSubscription(final RenewUserSubscriptionRequest request,
                                final StreamObserver<RenewUserSubscriptionResponse> responseObserver) {
    try {

      responseObserver.onNext(userSubscriptionService.renewUserSubscription(request));
      responseObserver.onCompleted();

    } catch (final ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final Exception exception) {
      log.error(exception.getMessage().concat(" for user ").concat(request.getParent()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for user ")
                  .concat(request.getParent()))
          .asRuntimeException());
    }
  }

  @Override
  public void removeUserSubscription(
      final RemoveUserSubscriptionRequest request,
      final StreamObserver<RemoveUserSubscriptionResponse> responseObserver) {

    try {

      responseObserver.onNext(userSubscriptionService.removeUserSubscription(request));
      responseObserver.onCompleted();

    } catch (final ResourceNotFoundException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.NOT_FOUND
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final InvalidArgumentException exception) {
      log.error(exception.getMessage());

      responseObserver.onError(
          Status.INVALID_ARGUMENT
              .withDescription(exception.getMessage())
              .asRuntimeException()
      );
    } catch (final Exception exception) {
      exception.printStackTrace();
      log.error(exception.getMessage().concat(" for user subscription ").concat(request.getName()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for user subscription ")
                  .concat(request.getName()))
          .asRuntimeException());
    }
  }

}
