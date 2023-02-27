package com.subscription.v1.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Service for genre related functionalities
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: subscriptionmanager/v1/proto/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GenreServiceGrpc {

  private GenreServiceGrpc() {}

  public static final String SERVICE_NAME = "subscriptionmanager.v1.proto.GenreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateGenreRequest,
      com.subscriptionmanager.v1.proto.Genre> getCreateGenreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createGenre",
      requestType = com.subscriptionmanager.v1.proto.CreateGenreRequest.class,
      responseType = com.subscriptionmanager.v1.proto.Genre.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateGenreRequest,
      com.subscriptionmanager.v1.proto.Genre> getCreateGenreMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.CreateGenreRequest, com.subscriptionmanager.v1.proto.Genre> getCreateGenreMethod;
    if ((getCreateGenreMethod = GenreServiceGrpc.getCreateGenreMethod) == null) {
      synchronized (GenreServiceGrpc.class) {
        if ((getCreateGenreMethod = GenreServiceGrpc.getCreateGenreMethod) == null) {
          GenreServiceGrpc.getCreateGenreMethod = getCreateGenreMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.CreateGenreRequest, com.subscriptionmanager.v1.proto.Genre>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createGenre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.CreateGenreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.Genre.getDefaultInstance()))
              .setSchemaDescriptor(new GenreServiceMethodDescriptorSupplier("createGenre"))
              .build();
        }
      }
    }
    return getCreateGenreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GenreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenreServiceStub>() {
        @java.lang.Override
        public GenreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenreServiceStub(channel, callOptions);
        }
      };
    return GenreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GenreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenreServiceBlockingStub>() {
        @java.lang.Override
        public GenreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenreServiceBlockingStub(channel, callOptions);
        }
      };
    return GenreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GenreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenreServiceFutureStub>() {
        @java.lang.Override
        public GenreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenreServiceFutureStub(channel, callOptions);
        }
      };
    return GenreServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Service for genre related functionalities
   * </pre>
   */
  public static abstract class GenreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Request for creation of new genre
     * </pre>
     */
    public void createGenre(com.subscriptionmanager.v1.proto.CreateGenreRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.Genre> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGenreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateGenreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.CreateGenreRequest,
                com.subscriptionmanager.v1.proto.Genre>(
                  this, METHODID_CREATE_GENRE)))
          .build();
    }
  }

  /**
   * <pre>
   *Service for genre related functionalities
   * </pre>
   */
  public static final class GenreServiceStub extends io.grpc.stub.AbstractAsyncStub<GenreServiceStub> {
    private GenreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request for creation of new genre
     * </pre>
     */
    public void createGenre(com.subscriptionmanager.v1.proto.CreateGenreRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.Genre> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGenreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service for genre related functionalities
   * </pre>
   */
  public static final class GenreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GenreServiceBlockingStub> {
    private GenreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request for creation of new genre
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.Genre createGenre(com.subscriptionmanager.v1.proto.CreateGenreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGenreMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service for genre related functionalities
   * </pre>
   */
  public static final class GenreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GenreServiceFutureStub> {
    private GenreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request for creation of new genre
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.Genre> createGenre(
        com.subscriptionmanager.v1.proto.CreateGenreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGenreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GENRE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GenreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GenreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_GENRE:
          serviceImpl.createGenre((com.subscriptionmanager.v1.proto.CreateGenreRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.Genre>) responseObserver);
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

  private static abstract class GenreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GenreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.v1.proto.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GenreService");
    }
  }

  private static final class GenreServiceFileDescriptorSupplier
      extends GenreServiceBaseDescriptorSupplier {
    GenreServiceFileDescriptorSupplier() {}
  }

  private static final class GenreServiceMethodDescriptorSupplier
      extends GenreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GenreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GenreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GenreServiceFileDescriptorSupplier())
              .addMethod(getCreateGenreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
