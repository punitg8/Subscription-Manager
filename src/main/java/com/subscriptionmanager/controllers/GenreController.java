package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.GenreServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.GenreService;
import com.subscriptionmanager.v1.proto.CreateGenreRequest;
import com.subscriptionmanager.v1.proto.Genre;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;

@Log4j2
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
      log.error(exception.getMessage().concat(" for genre ").concat(request.getGenre().toString()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for genre ")
                  .concat(request.getGenre().toString()))
          .asRuntimeException());
    }
  }

}
