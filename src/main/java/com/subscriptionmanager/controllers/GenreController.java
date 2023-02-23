package com.subscriptionmanager.controllers;

import com.subscription.proto.CreateGenreRequest;
import com.subscription.proto.Genre;
import com.subscription.proto.GenreServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.GenreService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class GenreController extends GenreServiceGrpc.GenreServiceImplBase {

  private final GenreService genreService;

  @Override
  public void createGenre(final CreateGenreRequest request,
                          final StreamObserver<Genre> responseObserver) {
    try {

      responseObserver.onNext(genreService.createGenre(request));
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

}
