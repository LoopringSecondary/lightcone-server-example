package kjkrol.grpc.numseq;

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
public class NumSeqServiceGrpc {

  private NumSeqServiceGrpc() {}

  public static final String SERVICE_NAME = "kjkrol.numseq.NumSeqService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<kjkrol.grpc.numseq.NumSeqRequest,
      kjkrol.grpc.numseq.NumSeqResponse> METHOD_NUM_SEQ =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "kjkrol.numseq.NumSeqService", "NumSeq"),
          io.grpc.protobuf.ProtoUtils.marshaller(kjkrol.grpc.numseq.NumSeqRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(kjkrol.grpc.numseq.NumSeqResponse.getDefaultInstance()));

  public static NumSeqServiceStub newStub(io.grpc.Channel channel) {
    return new NumSeqServiceStub(channel);
  }

  public static NumSeqServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NumSeqServiceBlockingStub(channel);
  }

  public static NumSeqServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NumSeqServiceFutureStub(channel);
  }

  public static interface NumSeqService {

    public void numSeq(kjkrol.grpc.numseq.NumSeqRequest request,
        io.grpc.stub.StreamObserver<kjkrol.grpc.numseq.NumSeqResponse> responseObserver);
  }

  public static interface NumSeqServiceBlockingClient {

    public java.util.Iterator<kjkrol.grpc.numseq.NumSeqResponse> numSeq(
        kjkrol.grpc.numseq.NumSeqRequest request);
  }

  public static interface NumSeqServiceFutureClient {
  }

  public static class NumSeqServiceStub extends io.grpc.stub.AbstractStub<NumSeqServiceStub>
      implements NumSeqService {
    private NumSeqServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumSeqServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumSeqServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumSeqServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void numSeq(kjkrol.grpc.numseq.NumSeqRequest request,
        io.grpc.stub.StreamObserver<kjkrol.grpc.numseq.NumSeqResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_NUM_SEQ, getCallOptions()), request, responseObserver);
    }
  }

  public static class NumSeqServiceBlockingStub extends io.grpc.stub.AbstractStub<NumSeqServiceBlockingStub>
      implements NumSeqServiceBlockingClient {
    private NumSeqServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumSeqServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumSeqServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumSeqServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<kjkrol.grpc.numseq.NumSeqResponse> numSeq(
        kjkrol.grpc.numseq.NumSeqRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_NUM_SEQ, getCallOptions(), request);
    }
  }

  public static class NumSeqServiceFutureStub extends io.grpc.stub.AbstractStub<NumSeqServiceFutureStub>
      implements NumSeqServiceFutureClient {
    private NumSeqServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumSeqServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumSeqServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumSeqServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NUM_SEQ = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumSeqService serviceImpl;
    private final int methodId;

    public MethodHandlers(NumSeqService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NUM_SEQ:
          serviceImpl.numSeq((kjkrol.grpc.numseq.NumSeqRequest) request,
              (io.grpc.stub.StreamObserver<kjkrol.grpc.numseq.NumSeqResponse>) responseObserver);
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
      final NumSeqService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_NUM_SEQ,
          asyncServerStreamingCall(
            new MethodHandlers<
              kjkrol.grpc.numseq.NumSeqRequest,
              kjkrol.grpc.numseq.NumSeqResponse>(
                serviceImpl, METHODID_NUM_SEQ)))
        .build();
  }
}
