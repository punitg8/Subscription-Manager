package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.SubscriptionServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.service.SubscriptionService;
import com.subscriptionmanager.v1.proto.CreateSubscriptionRequest;
import com.subscriptionmanager.v1.proto.Subscription;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class SubscriptionController extends SubscriptionServiceGrpc.SubscriptionServiceImplBase {

  private final SubscriptionService subscriptionService;

  @Override
  public void createSubscription(final CreateSubscriptionRequest request,
                                 final StreamObserver<Subscription> responseObserver) {
    try {

      responseObserver.onNext(subscriptionService.createSubscription(request));
      responseObserver.onCompleted();

    } catch (InvalidArgumentException exception) {
      responseObserver.onError(Status.INVALID_ARGUMENT
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
