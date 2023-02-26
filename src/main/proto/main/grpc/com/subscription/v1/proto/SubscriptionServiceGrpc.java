package com.subscription.v1.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: subscriptionmanager/v1/proto/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubscriptionServiceGrpc {

  private SubscriptionServiceGrpc() {}

  public static final String SERVICE_NAME = "subscriptionmanager.v1.proto.SubscriptionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateSubscriptionRequest,
      com.subscriptionmanager.v1.proto.Subscription> getCreateSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSubscription",
      requestType = com.subscriptionmanager.v1.proto.CreateSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.Subscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateSubscriptionRequest,
      com.subscriptionmanager.v1.proto.Subscription> getCreateSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateSubscriptionRequest, com.subscriptionmanager.v1.proto.Subscription> getCreateSubscriptionMethod;
    if ((getCreateSubscriptionMethod = SubscriptionServiceGrpc.getCreateSubscriptionMethod) == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        if ((getCreateSubscriptionMethod = SubscriptionServiceGrpc.getCreateSubscriptionMethod) == null) {
          SubscriptionServiceGrpc.getCreateSubscriptionMethod = getCreateSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.CreateSubscriptionRequest, com.subscriptionmanager.v1.proto.Subscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.CreateSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.Subscription.getDefaultInstance()))
              .setSchemaDescriptor(new SubscriptionServiceMethodDescriptorSupplier("createSubscription"))
              .build();
        }
      }
    }
    return getCreateSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscriptionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceStub>() {
        @java.lang.Override
        public SubscriptionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceStub(channel, callOptions);
        }
      };
    return SubscriptionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriptionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceBlockingStub>() {
        @java.lang.Override
        public SubscriptionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceBlockingStub(channel, callOptions);
        }
      };
    return SubscriptionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubscriptionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceFutureStub>() {
        @java.lang.Override
        public SubscriptionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceFutureStub(channel, callOptions);
        }
      };
    return SubscriptionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SubscriptionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSubscription(com.subscriptionmanager.v1.proto.CreateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.Subscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSubscriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.CreateSubscriptionRequest,
                com.subscriptionmanager.v1.proto.Subscription>(
                  this, METHODID_CREATE_SUBSCRIPTION)))
          .build();
    }
  }

  /**
   */
  public static final class SubscriptionServiceStub extends io.grpc.stub.AbstractAsyncStub<SubscriptionServiceStub> {
    private SubscriptionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriptionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSubscription(com.subscriptionmanager.v1.proto.CreateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.Subscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubscriptionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SubscriptionServiceBlockingStub> {
    private SubscriptionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriptionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.subscriptionmanager.v1.proto.Subscription createSubscription(com.subscriptionmanager.v1.proto.CreateSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSubscriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubscriptionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SubscriptionServiceFutureStub> {
    private SubscriptionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriptionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.Subscription> createSubscription(
        com.subscriptionmanager.v1.proto.CreateSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBSCRIPTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscriptionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubscriptionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SUBSCRIPTION:
          serviceImpl.createSubscription((com.subscriptionmanager.v1.proto.CreateSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.Subscription>) responseObserver);
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

  private static abstract class SubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubscriptionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.v1.proto.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubscriptionService");
    }
  }

  private static final class SubscriptionServiceFileDescriptorSupplier
      extends SubscriptionServiceBaseDescriptorSupplier {
    SubscriptionServiceFileDescriptorSupplier() {}
  }

  private static final class SubscriptionServiceMethodDescriptorSupplier
      extends SubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubscriptionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubscriptionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubscriptionServiceFileDescriptorSupplier())
              .addMethod(getCreateSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
