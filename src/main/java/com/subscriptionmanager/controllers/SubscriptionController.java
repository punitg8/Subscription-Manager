package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.SubscriptionServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.service.SubscriptionService;
import com.subscriptionmanager.v1.proto.CreateSubscriptionRequest;
import com.subscriptionmanager.v1.proto.Subscription;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;

@Log4j2
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
      log.error(exception.getMessage());

      responseObserver.onError(Status.INVALID_ARGUMENT
          .withDescription(exception.getMessage())
          .asRuntimeException()
      );
    } catch (Exception exception) {
      log.error(exception.getMessage().concat(" for subscription ").concat(request.getSubscription().toString()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for subscription ")
                  .concat(request.getSubscription().toString()))
          .asRuntimeException());
    }
  }

}
