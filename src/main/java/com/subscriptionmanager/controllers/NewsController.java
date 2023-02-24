package com.subscriptionmanager.controllers;

import com.subscription.proto.CreateNewsRequest;
import com.subscription.proto.News;
import com.subscription.proto.NewsServiceGrpc;
import com.subscriptionmanager.exception.InvalidArgumentException;
import com.subscriptionmanager.exception.ResourceNotFoundException;
import com.subscriptionmanager.service.NewsService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

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
