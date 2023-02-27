package com.subscription.v1.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Service for news related functionalities
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: subscriptionmanager/v1/proto/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NewsServiceGrpc {

  private NewsServiceGrpc() {}

  public static final String SERVICE_NAME = "subscriptionmanager.v1.proto.NewsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateNewsRequest,
      com.subscriptionmanager.v1.proto.News> getCreateNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createNews",
      requestType = com.subscriptionmanager.v1.proto.CreateNewsRequest.class,
      responseType = com.subscriptionmanager.v1.proto.News.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateNewsRequest,
      com.subscriptionmanager.v1.proto.News> getCreateNewsMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateNewsRequest, com.subscriptionmanager.v1.proto.News> getCreateNewsMethod;
    if ((getCreateNewsMethod = NewsServiceGrpc.getCreateNewsMethod) == null) {
      synchronized (NewsServiceGrpc.class) {
        if ((getCreateNewsMethod = NewsServiceGrpc.getCreateNewsMethod) == null) {
          NewsServiceGrpc.getCreateNewsMethod = getCreateNewsMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.CreateNewsRequest, com.subscriptionmanager.v1.proto.News>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.CreateNewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.News.getDefaultInstance()))
              .setSchemaDescriptor(new NewsServiceMethodDescriptorSupplier("createNews"))
              .build();
        }
      }
    }
    return getCreateNewsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsServiceStub>() {
        @java.lang.Override
        public NewsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsServiceStub(channel, callOptions);
        }
      };
    return NewsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsServiceBlockingStub>() {
        @java.lang.Override
        public NewsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsServiceBlockingStub(channel, callOptions);
        }
      };
    return NewsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsServiceFutureStub>() {
        @java.lang.Override
        public NewsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsServiceFutureStub(channel, callOptions);
        }
      };
    return NewsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Service for news related functionalities
   * </pre>
   */
  public static abstract class NewsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Request for creation of new news
     * </pre>
     */
    public void createNews(com.subscriptionmanager.v1.proto.CreateNewsRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.News> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.CreateNewsRequest,
                com.subscriptionmanager.v1.proto.News>(
                  this, METHODID_CREATE_NEWS)))
          .build();
    }
  }

  /**
   * <pre>
   *Service for news related functionalities
   * </pre>
   */
  public static final class NewsServiceStub extends io.grpc.stub.AbstractAsyncStub<NewsServiceStub> {
    private NewsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request for creation of new news
     * </pre>
     */
    public void createNews(com.subscriptionmanager.v1.proto.CreateNewsRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.News> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service for news related functionalities
   * </pre>
   */
  public static final class NewsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NewsServiceBlockingStub> {
    private NewsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request for creation of new news
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.News createNews(com.subscriptionmanager.v1.proto.CreateNewsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service for news related functionalities
   * </pre>
   */
  public static final class NewsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NewsServiceFutureStub> {
    private NewsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request for creation of new news
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.News> createNews(
        com.subscriptionmanager.v1.proto.CreateNewsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEWS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NewsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NewsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NEWS:
          serviceImpl.createNews((com.subscriptionmanager.v1.proto.CreateNewsRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.News>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NewsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.v1.proto.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewsService");
    }
  }

  private static final class NewsServiceFileDescriptorSupplier
      extends NewsServiceBaseDescriptorSupplier {
    NewsServiceFileDescriptorSupplier() {}
  }

  private static final class NewsServiceMethodDescriptorSupplier
      extends NewsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NewsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NewsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewsServiceFileDescriptorSupplier())
              .addMethod(getCreateNewsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
