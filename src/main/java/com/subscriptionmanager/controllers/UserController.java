package com.subscriptionmanager.controllers;

import com.subscription.proto.AddSubscriptionRequest;
import com.subscription.proto.AddSubscriptionResponse;
import com.subscription.proto.DeleteSubscriptionRequest;
import com.subscription.proto.DeleteSubscriptionResponse;
import com.subscription.proto.ListSubscriptionRequest;
import com.subscription.proto.ListSubscriptionResponse;
import com.subscription.proto.RenewSubscriptionRequest;
import com.subscription.proto.RenewSubscriptionResponse;
import com.subscription.proto.UserServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.UserService;
import com.subscriptionmanager.service.impl.UserServiceImpl;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class UserController extends UserServiceGrpc.UserServiceImplBase {

  private final UserService userService;

  @Override
  public void listSubscription(ListSubscriptionRequest request,
                               StreamObserver<ListSubscriptionResponse> responseObserver) {
    try{

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
    } catch (Exception exception){
      exception.printStackTrace();
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void addSubscription(AddSubscriptionRequest request,
                              StreamObserver<AddSubscriptionResponse> responseObserver) {
    try{

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
    } catch (Exception exception){
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void renewSubscription(RenewSubscriptionRequest request,
                                StreamObserver<RenewSubscriptionResponse> responseObserver) {
    try{

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
    } catch (Exception exception){
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

  @Override
  public void deleteSubscription(DeleteSubscriptionRequest request,
                                 StreamObserver<DeleteSubscriptionResponse> responseObserver) {
    try{

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
    } catch (Exception exception){
      exception.printStackTrace();
      responseObserver.onError(Status.UNKNOWN
          .withDescription(exception.getMessage())
          .asRuntimeException());
    }
  }

}
