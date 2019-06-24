package kjkrol.grpc.echo;

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
public class EchoServiceGrpc {

  private EchoServiceGrpc() {}

  public static final String SERVICE_NAME = "kjkrol.echo.EchoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<kjkrol.grpc.echo.EchoRequest,
      kjkrol.grpc.echo.EchoResponse> METHOD_ECHO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "kjkrol.echo.EchoService", "Echo"),
          io.grpc.protobuf.ProtoUtils.marshaller(kjkrol.grpc.echo.EchoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(kjkrol.grpc.echo.EchoResponse.getDefaultInstance()));

  public static EchoServiceStub newStub(io.grpc.Channel channel) {
    return new EchoServiceStub(channel);
  }

  public static EchoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EchoServiceBlockingStub(channel);
  }

  public static EchoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EchoServiceFutureStub(channel);
  }

  public static interface EchoService {

    public void echo(kjkrol.grpc.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<kjkrol.grpc.echo.EchoResponse> responseObserver);
  }

  public static interface EchoServiceBlockingClient {

    public kjkrol.grpc.echo.EchoResponse echo(kjkrol.grpc.echo.EchoRequest request);
  }

  public static interface EchoServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<kjkrol.grpc.echo.EchoResponse> echo(
        kjkrol.grpc.echo.EchoRequest request);
  }

  public static class EchoServiceStub extends io.grpc.stub.AbstractStub<EchoServiceStub>
      implements EchoService {
    private EchoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void echo(kjkrol.grpc.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<kjkrol.grpc.echo.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ECHO, getCallOptions()), request, responseObserver);
    }
  }

  public static class EchoServiceBlockingStub extends io.grpc.stub.AbstractStub<EchoServiceBlockingStub>
      implements EchoServiceBlockingClient {
    private EchoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public kjkrol.grpc.echo.EchoResponse echo(kjkrol.grpc.echo.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ECHO, getCallOptions(), request);
    }
  }

  public static class EchoServiceFutureStub extends io.grpc.stub.AbstractStub<EchoServiceFutureStub>
      implements EchoServiceFutureClient {
    private EchoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<kjkrol.grpc.echo.EchoResponse> echo(
        kjkrol.grpc.echo.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ECHO, getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoService serviceImpl;
    private final int methodId;

    public MethodHandlers(EchoService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((kjkrol.grpc.echo.EchoRequest) request,
              (io.grpc.stub.StreamObserver<kjkrol.grpc.echo.EchoResponse>) responseObserver);
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
      final EchoService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ECHO,
          asyncUnaryCall(
            new MethodHandlers<
              kjkrol.grpc.echo.EchoRequest,
              kjkrol.grpc.echo.EchoResponse>(
                serviceImpl, METHODID_ECHO)))
        .build();
  }
}
