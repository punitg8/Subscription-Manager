package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.AuthenticationServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.service.AuthenticationService;
import com.subscriptionmanager.v1.proto.CreateUserRequest;
import com.subscriptionmanager.v1.proto.User;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;

@Log4j2
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
      log.error(exception.getMessage());

      responseObserver.onError(Status.INVALID_ARGUMENT
          .withDescription(exception.getMessage())
          .asRuntimeException()
      );
    } catch (Exception exception) {
      log.error(exception.getMessage().concat(" for user ").concat(request.getUser().toString()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for user ")
                  .concat(request.getUser().toString()))
          .asRuntimeException());
    }
  }

}
