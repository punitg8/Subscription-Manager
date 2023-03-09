package com.subscriptionmanager.controllers;

import com.subscription.v1.proto.NewsServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.NewsService;
import com.subscriptionmanager.v1.proto.CreateNewsRequest;
import com.subscriptionmanager.v1.proto.News;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.lognet.springboot.grpc.GRpcService;

@Log4j2
@RequiredArgsConstructor
@GRpcService
public class NewsController extends NewsServiceGrpc.NewsServiceImplBase {

  private final NewsService newsService;

  @Override
  public void createNews(final CreateNewsRequest request,
                         final StreamObserver<News> responseObserver) {
    try {

      responseObserver.onNext(newsService.createNews(request));
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
      log.error(exception.getMessage().concat(" for news ").concat(request.getNews().toString()));
      responseObserver.onError(Status.UNKNOWN
          .withDescription(
              exception.getMessage()
                  .concat(" for news ")
                  .concat(request.getNews().toString()))
          .asRuntimeException());
    }
  }

}
