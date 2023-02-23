package com.subscription.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.subscriptionmanager.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscription.proto.ListSubscriptionRequest,
      com.subscription.proto.ListSubscriptionResponse> getListSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubscription",
      requestType = com.subscription.proto.ListSubscriptionRequest.class,
      responseType = com.subscription.proto.ListSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscription.proto.ListSubscriptionRequest,
      com.subscription.proto.ListSubscriptionResponse> getListSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscription.proto.ListSubscriptionRequest, com.subscription.proto.ListSubscriptionResponse> getListSubscriptionMethod;
    if ((getListSubscriptionMethod = UserServiceGrpc.getListSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListSubscriptionMethod = UserServiceGrpc.getListSubscriptionMethod) == null) {
          UserServiceGrpc.getListSubscriptionMethod = getListSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscription.proto.ListSubscriptionRequest, com.subscription.proto.ListSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.ListSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.ListSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListSubscription"))
              .build();
        }
      }
    }
    return getListSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscription.proto.AddSubscriptionRequest,
      com.subscription.proto.AddSubscriptionResponse> getAddSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscription",
      requestType = com.subscription.proto.AddSubscriptionRequest.class,
      responseType = com.subscription.proto.AddSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscription.proto.AddSubscriptionRequest,
      com.subscription.proto.AddSubscriptionResponse> getAddSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscription.proto.AddSubscriptionRequest, com.subscription.proto.AddSubscriptionResponse> getAddSubscriptionMethod;
    if ((getAddSubscriptionMethod = UserServiceGrpc.getAddSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddSubscriptionMethod = UserServiceGrpc.getAddSubscriptionMethod) == null) {
          UserServiceGrpc.getAddSubscriptionMethod = getAddSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscription.proto.AddSubscriptionRequest, com.subscription.proto.AddSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.AddSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.AddSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddSubscription"))
              .build();
        }
      }
    }
    return getAddSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscription.proto.RenewSubscriptionRequest,
      com.subscription.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewSubscription",
      requestType = com.subscription.proto.RenewSubscriptionRequest.class,
      responseType = com.subscription.proto.RenewSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscription.proto.RenewSubscriptionRequest,
      com.subscription.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscription.proto.RenewSubscriptionRequest, com.subscription.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod;
    if ((getRenewSubscriptionMethod = UserServiceGrpc.getRenewSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRenewSubscriptionMethod = UserServiceGrpc.getRenewSubscriptionMethod) == null) {
          UserServiceGrpc.getRenewSubscriptionMethod = getRenewSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscription.proto.RenewSubscriptionRequest, com.subscription.proto.RenewSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.RenewSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.RenewSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RenewSubscription"))
              .build();
        }
      }
    }
    return getRenewSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscription.proto.DeleteSubscriptionRequest,
      com.subscription.proto.DeleteSubscriptionResponse> getDeleteSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSubscription",
      requestType = com.subscription.proto.DeleteSubscriptionRequest.class,
      responseType = com.subscription.proto.DeleteSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscription.proto.DeleteSubscriptionRequest,
      com.subscription.proto.DeleteSubscriptionResponse> getDeleteSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscription.proto.DeleteSubscriptionRequest, com.subscription.proto.DeleteSubscriptionResponse> getDeleteSubscriptionMethod;
    if ((getDeleteSubscriptionMethod = UserServiceGrpc.getDeleteSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteSubscriptionMethod = UserServiceGrpc.getDeleteSubscriptionMethod) == null) {
          UserServiceGrpc.getDeleteSubscriptionMethod = getDeleteSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscription.proto.DeleteSubscriptionRequest, com.subscription.proto.DeleteSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.DeleteSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscription.proto.DeleteSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteSubscription"))
              .build();
        }
      }
    }
    return getDeleteSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listSubscription(com.subscription.proto.ListSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.ListSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void addSubscription(com.subscription.proto.AddSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.AddSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void renewSubscription(com.subscription.proto.RenewSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.RenewSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteSubscription(com.subscription.proto.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.DeleteSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSubscriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscription.proto.ListSubscriptionRequest,
                com.subscription.proto.ListSubscriptionResponse>(
                  this, METHODID_LIST_SUBSCRIPTION)))
          .addMethod(
            getAddSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscription.proto.AddSubscriptionRequest,
                com.subscription.proto.AddSubscriptionResponse>(
                  this, METHODID_ADD_SUBSCRIPTION)))
          .addMethod(
            getRenewSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscription.proto.RenewSubscriptionRequest,
                com.subscription.proto.RenewSubscriptionResponse>(
                  this, METHODID_RENEW_SUBSCRIPTION)))
          .addMethod(
            getDeleteSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscription.proto.DeleteSubscriptionRequest,
                com.subscription.proto.DeleteSubscriptionResponse>(
                  this, METHODID_DELETE_SUBSCRIPTION)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void listSubscription(com.subscription.proto.ListSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.ListSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscription(com.subscription.proto.AddSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.AddSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renewSubscription(com.subscription.proto.RenewSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.RenewSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSubscription(com.subscription.proto.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscription.proto.DeleteSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.subscription.proto.ListSubscriptionResponse listSubscription(com.subscription.proto.ListSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.subscription.proto.AddSubscriptionResponse addSubscription(com.subscription.proto.AddSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.subscription.proto.RenewSubscriptionResponse renewSubscription(com.subscription.proto.RenewSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.subscription.proto.DeleteSubscriptionResponse deleteSubscription(com.subscription.proto.DeleteSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSubscriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscription.proto.ListSubscriptionResponse> listSubscription(
        com.subscription.proto.ListSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscription.proto.AddSubscriptionResponse> addSubscription(
        com.subscription.proto.AddSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscription.proto.RenewSubscriptionResponse> renewSubscription(
        com.subscription.proto.RenewSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscription.proto.DeleteSubscriptionResponse> deleteSubscription(
        com.subscription.proto.DeleteSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SUBSCRIPTION = 0;
  private static final int METHODID_ADD_SUBSCRIPTION = 1;
  private static final int METHODID_RENEW_SUBSCRIPTION = 2;
  private static final int METHODID_DELETE_SUBSCRIPTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SUBSCRIPTION:
          serviceImpl.listSubscription((com.subscription.proto.ListSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscription.proto.ListSubscriptionResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIPTION:
          serviceImpl.addSubscription((com.subscription.proto.AddSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscription.proto.AddSubscriptionResponse>) responseObserver);
          break;
        case METHODID_RENEW_SUBSCRIPTION:
          serviceImpl.renewSubscription((com.subscription.proto.RenewSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscription.proto.RenewSubscriptionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBSCRIPTION:
          serviceImpl.deleteSubscription((com.subscription.proto.DeleteSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscription.proto.DeleteSubscriptionResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.proto.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getListSubscriptionMethod())
              .addMethod(getAddSubscriptionMethod())
              .addMethod(getRenewSubscriptionMethod())
              .addMethod(getDeleteSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
