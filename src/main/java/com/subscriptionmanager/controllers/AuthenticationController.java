package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.AuthenticationServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.service.AuthenticationService;
import com.subscriptionmanager.v1.proto.CreateUserRequest;
import com.subscriptionmanager.v1.proto.User;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class AuthenticationController
    extends AuthenticationServiceGrpc.AuthenticationServiceImplBase {

  private final AuthenticationService authenticationService;

  @Override
  public void createUser(final CreateUserRequest request,
                         final StreamObserver<User> responseObserver) {
    try {

      responseObserver.onNext(authenticationService.createUser(request));
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
