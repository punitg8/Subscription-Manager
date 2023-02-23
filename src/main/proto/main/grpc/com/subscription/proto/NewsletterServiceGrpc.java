package com.subscription.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NewsletterServiceGrpc {

  private NewsletterServiceGrpc() {}

  public static final String SERVICE_NAME = "com.subscriptionmanager.NewsletterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscription.proto.Empty,
      com.subscription.proto.Empty> getSendNewsletterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendNewsletter",
      requestType = com.subscription.proto.Empty.class,
      responseType = com.subscription.proto.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscription.proto.Empty,
      com.subscription.proto.Empty> getSendNewsletterMethod() {
    io.grpc.MethodDescriptor<com.subscription.proto.Empty, com.subscription.proto.Empty> getSendNewsletterMethod;
    if ((getSendNewsletterMethod = NewsletterServiceGrpc.getSendNewsletterMethod) == null) {
      synchronized (NewsletterServiceGrpc.class) {
        if ((getSendNewsletterMethod = NewsletterServiceGrpc.getSendNewsletterMethod) == null) {
          NewsletterServiceGrpc.getSendNewsletterMethod = getSendNewsletterMethod =
              io.grpc.MethodDescriptor.<com.subscription.proto.Empty, com.subscription.proto.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendNewsletter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NewsletterServiceMethodDescriptorSupplier("sendNewsletter"))
              .build();
        }
      }
    }
    return getSendNewsletterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewsletterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsletterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsletterServiceStub>() {
        @java.lang.Override
        public NewsletterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsletterServiceStub(channel, callOptions);
        }
      };
    return NewsletterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewsletterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsletterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsletterServiceBlockingStub>() {
        @java.lang.Override
        public NewsletterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsletterServiceBlockingStub(channel, callOptions);
        }
      };
    return NewsletterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewsletterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsletterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsletterServiceFutureStub>() {
        @java.lang.Override
        public NewsletterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsletterServiceFutureStub(channel, callOptions);
        }
      };
    return NewsletterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NewsletterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendNewsletter(com.subscription.proto.Empty request,
        io.grpc.stub.StreamObserver<com.subscription.proto.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNewsletterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendNewsletterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscription.proto.Empty,
                com.subscription.proto.Empty>(
                  this, METHODID_SEND_NEWSLETTER)))
          .build();
    }
  }

  /**
   */
  public static final class NewsletterServiceStub extends io.grpc.stub.AbstractAsyncStub<NewsletterServiceStub> {
    private NewsletterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsletterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsletterServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendNewsletter(com.subscription.proto.Empty request,
        io.grpc.stub.StreamObserver<com.subscription.proto.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNewsletterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NewsletterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NewsletterServiceBlockingStub> {
    private NewsletterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsletterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsletterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.subscription.proto.Empty sendNewsletter(com.subscription.proto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNewsletterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NewsletterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NewsletterServiceFutureStub> {
    private NewsletterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsletterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsletterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscription.proto.Empty> sendNewsletter(
        com.subscription.proto.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNewsletterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_NEWSLETTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NewsletterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NewsletterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_NEWSLETTER:
          serviceImpl.sendNewsletter((com.subscription.proto.Empty) request,
              (io.grpc.stub.StreamObserver<com.subscription.proto.Empty>) responseObserver);
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

  private static abstract class NewsletterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewsletterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.proto.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewsletterService");
    }
  }

  private static final class NewsletterServiceFileDescriptorSupplier
      extends NewsletterServiceBaseDescriptorSupplier {
    NewsletterServiceFileDescriptorSupplier() {}
  }

  private static final class NewsletterServiceMethodDescriptorSupplier
      extends NewsletterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NewsletterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NewsletterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewsletterServiceFileDescriptorSupplier())
              .addMethod(getSendNewsletterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
