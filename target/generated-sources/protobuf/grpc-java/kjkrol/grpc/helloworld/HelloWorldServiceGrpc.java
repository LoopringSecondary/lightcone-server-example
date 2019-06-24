package kjkrol.grpc.helloworld;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class HelloWorldServiceGrpc {

  private HelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "kjkrol.helloworld.HelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      kjkrol.grpc.helloworld.HelloWorldResponse> METHOD_HELLO_WORLD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "kjkrol.helloworld.HelloWorldService", "HelloWorld"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(kjkrol.grpc.helloworld.HelloWorldResponse.getDefaultInstance()));

  public static HelloWorldServiceStub newStub(io.grpc.Channel channel) {
    return new HelloWorldServiceStub(channel);
  }

  public static HelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceBlockingStub(channel);
  }

  public static HelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceFutureStub(channel);
  }

  public static interface HelloWorldService {

    public void helloWorld(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<kjkrol.grpc.helloworld.HelloWorldResponse> responseObserver);
  }

  public static interface HelloWorldServiceBlockingClient {

    public kjkrol.grpc.helloworld.HelloWorldResponse helloWorld(com.google.protobuf.Empty request);
  }

  public static interface HelloWorldServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<kjkrol.grpc.helloworld.HelloWorldResponse> helloWorld(
        com.google.protobuf.Empty request);
  }

  public static class HelloWorldServiceStub extends io.grpc.stub.AbstractStub<HelloWorldServiceStub>
      implements HelloWorldService {
    private HelloWorldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void helloWorld(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<kjkrol.grpc.helloworld.HelloWorldResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HELLO_WORLD, getCallOptions()), request, responseObserver);
    }
  }

  public static class HelloWorldServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloWorldServiceBlockingStub>
      implements HelloWorldServiceBlockingClient {
    private HelloWorldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public kjkrol.grpc.helloworld.HelloWorldResponse helloWorld(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HELLO_WORLD, getCallOptions(), request);
    }
  }

  public static class HelloWorldServiceFutureStub extends io.grpc.stub.AbstractStub<HelloWorldServiceFutureStub>
      implements HelloWorldServiceFutureClient {
    private HelloWorldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<kjkrol.grpc.helloworld.HelloWorldResponse> helloWorld(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HELLO_WORLD, getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_WORLD = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldService serviceImpl;
    private final int methodId;

    public MethodHandlers(HelloWorldService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_WORLD:
          serviceImpl.helloWorld((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<kjkrol.grpc.helloworld.HelloWorldResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final HelloWorldService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_HELLO_WORLD,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              kjkrol.grpc.helloworld.HelloWorldResponse>(
                serviceImpl, METHODID_HELLO_WORLD)))
        .build();
  }
}
