package io.lightcone.data.dex;

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
public class DexServiceGrpc {

  private DexServiceGrpc() {}

  public static final String SERVICE_NAME = "io.lightcone.data.dex.DexServiceImpl";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.lightcone.data.dex.DexConfigurations> METHOD_GET_DEX_CONFIGURATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getDexConfigurations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.DexConfigurations.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetTokensReq,
      io.lightcone.data.dex.GetTokensRes> METHOD_GET_TOKENS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getTokens"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetTokensReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetTokensRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetMarketsReq,
      io.lightcone.data.dex.GetMarketsRes> METHOD_GET_MARKETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getMarkets"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetMarketsReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetMarketsRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetMarketFillsReq,
      io.lightcone.data.dex.GetFillsRes> METHOD_GET_MARKET_FILLS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getMarketFills"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetMarketFillsReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetFillsRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetOrderBookReq,
      io.lightcone.data.dex.OrderBook> METHOD_GET_ORDER_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getOrderBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetOrderBookReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.OrderBook.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetCandlesReq,
      io.lightcone.data.dex.Candles> METHOD_GET_CANDLES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getCandles"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetCandlesReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.Candles.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      io.lightcone.data.dex.Account> METHOD_GET_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.Account.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetUserOrdersReq,
      io.lightcone.data.dex.GetUserOrdersRes> METHOD_GET_USER_ORDERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getUserOrders"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetUserOrdersReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetUserOrdersRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetUserFillsReq,
      io.lightcone.data.dex.GetFillsRes> METHOD_GET_USER_FILLS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getUserFills"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetUserFillsReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetFillsRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetUserTransactionsReq,
      io.lightcone.data.dex.GetUserTransactionsRes> METHOD_GET_USER_TRANSFERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getUserTransfers"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetUserTransactionsReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetUserTransactionsRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.GetNextOrderIdReq,
      com.google.protobuf.UInt32Value> METHOD_GET_NEXT_ORDER_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getNextOrderId"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.GetNextOrderIdReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.UInt32Value.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.google.protobuf.UInt32Value,
      com.google.protobuf.UInt32Value> METHOD_GET_NONCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "getNonce"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.UInt32Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.UInt32Value.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.order.Order,
      io.lightcone.data.dex.SubmitOrderRes> METHOD_SUBMIT_ORDER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "submitOrder"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.order.Order.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.SubmitOrderRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.dex.SimpleOrderCancellationReq,
      io.lightcone.data.dex.CancelOrderRes> METHOD_CANCEL_ORDER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "cancelOrder"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.SimpleOrderCancellationReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.CancelOrderRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.requests.OrderCancellationRequest,
      io.lightcone.data.dex.CancelOrderRes> METHOD_SUBMIT_ORDER_CANCELLATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "submitOrderCancellation"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.requests.OrderCancellationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.CancelOrderRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.lightcone.data.requests.OffchainWithdrawalRequest,
      io.lightcone.data.dex.OffchainWithdrawalalRes> METHOD_SUBMIT_OFFCHAIN_WITHDRAWAL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.lightcone.data.dex.DexServiceImpl", "submitOffchainWithdrawal"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.requests.OffchainWithdrawalRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.lightcone.data.dex.OffchainWithdrawalalRes.getDefaultInstance()));

  public static DexServiceStub newStub(io.grpc.Channel channel) {
    return new DexServiceStub(channel);
  }

  public static DexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DexServiceBlockingStub(channel);
  }

  public static DexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DexServiceFutureStub(channel);
  }

  public static interface DexService {

    public void getDexConfigurations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.DexConfigurations> responseObserver);

    public void getTokens(io.lightcone.data.dex.GetTokensReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetTokensRes> responseObserver);

    public void getMarkets(io.lightcone.data.dex.GetMarketsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetMarketsRes> responseObserver);

    public void getMarketFills(io.lightcone.data.dex.GetMarketFillsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetFillsRes> responseObserver);

    public void getOrderBook(io.lightcone.data.dex.GetOrderBookReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.OrderBook> responseObserver);

    public void getCandles(io.lightcone.data.dex.GetCandlesReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.Candles> responseObserver);

    public void getAccount(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.Account> responseObserver);

    public void getUserOrders(io.lightcone.data.dex.GetUserOrdersReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetUserOrdersRes> responseObserver);

    public void getUserFills(io.lightcone.data.dex.GetUserFillsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetFillsRes> responseObserver);

    public void getUserTransfers(io.lightcone.data.dex.GetUserTransactionsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetUserTransactionsRes> responseObserver);

    public void getNextOrderId(io.lightcone.data.dex.GetNextOrderIdReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.UInt32Value> responseObserver);

    public void getNonce(com.google.protobuf.UInt32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.UInt32Value> responseObserver);

    public void submitOrder(io.lightcone.data.order.Order request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.SubmitOrderRes> responseObserver);

    public void cancelOrder(io.lightcone.data.dex.SimpleOrderCancellationReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.CancelOrderRes> responseObserver);

    public void submitOrderCancellation(io.lightcone.data.requests.OrderCancellationRequest request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.CancelOrderRes> responseObserver);

    public void submitOffchainWithdrawal(io.lightcone.data.requests.OffchainWithdrawalRequest request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.OffchainWithdrawalalRes> responseObserver);
  }

  public static interface DexServiceBlockingClient {

    public io.lightcone.data.dex.DexConfigurations getDexConfigurations(com.google.protobuf.Empty request);

    public io.lightcone.data.dex.GetTokensRes getTokens(io.lightcone.data.dex.GetTokensReq request);

    public io.lightcone.data.dex.GetMarketsRes getMarkets(io.lightcone.data.dex.GetMarketsReq request);

    public io.lightcone.data.dex.GetFillsRes getMarketFills(io.lightcone.data.dex.GetMarketFillsReq request);

    public io.lightcone.data.dex.OrderBook getOrderBook(io.lightcone.data.dex.GetOrderBookReq request);

    public io.lightcone.data.dex.Candles getCandles(io.lightcone.data.dex.GetCandlesReq request);

    public io.lightcone.data.dex.Account getAccount(com.google.protobuf.StringValue request);

    public io.lightcone.data.dex.GetUserOrdersRes getUserOrders(io.lightcone.data.dex.GetUserOrdersReq request);

    public io.lightcone.data.dex.GetFillsRes getUserFills(io.lightcone.data.dex.GetUserFillsReq request);

    public io.lightcone.data.dex.GetUserTransactionsRes getUserTransfers(io.lightcone.data.dex.GetUserTransactionsReq request);

    public com.google.protobuf.UInt32Value getNextOrderId(io.lightcone.data.dex.GetNextOrderIdReq request);

    public com.google.protobuf.UInt32Value getNonce(com.google.protobuf.UInt32Value request);

    public io.lightcone.data.dex.SubmitOrderRes submitOrder(io.lightcone.data.order.Order request);

    public io.lightcone.data.dex.CancelOrderRes cancelOrder(io.lightcone.data.dex.SimpleOrderCancellationReq request);

    public io.lightcone.data.dex.CancelOrderRes submitOrderCancellation(io.lightcone.data.requests.OrderCancellationRequest request);

    public io.lightcone.data.dex.OffchainWithdrawalalRes submitOffchainWithdrawal(io.lightcone.data.requests.OffchainWithdrawalRequest request);
  }

  public static interface DexServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.DexConfigurations> getDexConfigurations(
        com.google.protobuf.Empty request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetTokensRes> getTokens(
        io.lightcone.data.dex.GetTokensReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetMarketsRes> getMarkets(
        io.lightcone.data.dex.GetMarketsReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetFillsRes> getMarketFills(
        io.lightcone.data.dex.GetMarketFillsReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.OrderBook> getOrderBook(
        io.lightcone.data.dex.GetOrderBookReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.Candles> getCandles(
        io.lightcone.data.dex.GetCandlesReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.Account> getAccount(
        com.google.protobuf.StringValue request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetUserOrdersRes> getUserOrders(
        io.lightcone.data.dex.GetUserOrdersReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetFillsRes> getUserFills(
        io.lightcone.data.dex.GetUserFillsReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetUserTransactionsRes> getUserTransfers(
        io.lightcone.data.dex.GetUserTransactionsReq request);

    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.UInt32Value> getNextOrderId(
        io.lightcone.data.dex.GetNextOrderIdReq request);

    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.UInt32Value> getNonce(
        com.google.protobuf.UInt32Value request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.SubmitOrderRes> submitOrder(
        io.lightcone.data.order.Order request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.CancelOrderRes> cancelOrder(
        io.lightcone.data.dex.SimpleOrderCancellationReq request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.CancelOrderRes> submitOrderCancellation(
        io.lightcone.data.requests.OrderCancellationRequest request);

    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.OffchainWithdrawalalRes> submitOffchainWithdrawal(
        io.lightcone.data.requests.OffchainWithdrawalRequest request);
  }

  public static class DexServiceStub extends io.grpc.stub.AbstractStub<DexServiceStub>
      implements DexService {
    private DexServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DexServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DexServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DexServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getDexConfigurations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.DexConfigurations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEX_CONFIGURATIONS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getTokens(io.lightcone.data.dex.GetTokensReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetTokensRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOKENS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getMarkets(io.lightcone.data.dex.GetMarketsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetMarketsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MARKETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getMarketFills(io.lightcone.data.dex.GetMarketFillsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetFillsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MARKET_FILLS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getOrderBook(io.lightcone.data.dex.GetOrderBookReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.OrderBook> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER_BOOK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getCandles(io.lightcone.data.dex.GetCandlesReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.Candles> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CANDLES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getAccount(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getUserOrders(io.lightcone.data.dex.GetUserOrdersReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetUserOrdersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_ORDERS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getUserFills(io.lightcone.data.dex.GetUserFillsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetFillsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_FILLS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getUserTransfers(io.lightcone.data.dex.GetUserTransactionsReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetUserTransactionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_TRANSFERS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getNextOrderId(io.lightcone.data.dex.GetNextOrderIdReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.UInt32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NEXT_ORDER_ID, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getNonce(com.google.protobuf.UInt32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.UInt32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NONCE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void submitOrder(io.lightcone.data.order.Order request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.SubmitOrderRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_ORDER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void cancelOrder(io.lightcone.data.dex.SimpleOrderCancellationReq request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.CancelOrderRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_ORDER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void submitOrderCancellation(io.lightcone.data.requests.OrderCancellationRequest request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.CancelOrderRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_ORDER_CANCELLATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void submitOffchainWithdrawal(io.lightcone.data.requests.OffchainWithdrawalRequest request,
        io.grpc.stub.StreamObserver<io.lightcone.data.dex.OffchainWithdrawalalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_OFFCHAIN_WITHDRAWAL, getCallOptions()), request, responseObserver);
    }
  }

  public static class DexServiceBlockingStub extends io.grpc.stub.AbstractStub<DexServiceBlockingStub>
      implements DexServiceBlockingClient {
    private DexServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DexServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DexServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DexServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public io.lightcone.data.dex.DexConfigurations getDexConfigurations(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEX_CONFIGURATIONS, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.GetTokensRes getTokens(io.lightcone.data.dex.GetTokensReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOKENS, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.GetMarketsRes getMarkets(io.lightcone.data.dex.GetMarketsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MARKETS, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.GetFillsRes getMarketFills(io.lightcone.data.dex.GetMarketFillsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MARKET_FILLS, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.OrderBook getOrderBook(io.lightcone.data.dex.GetOrderBookReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDER_BOOK, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.Candles getCandles(io.lightcone.data.dex.GetCandlesReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CANDLES, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.Account getAccount(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACCOUNT, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.GetUserOrdersRes getUserOrders(io.lightcone.data.dex.GetUserOrdersReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_ORDERS, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.GetFillsRes getUserFills(io.lightcone.data.dex.GetUserFillsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_FILLS, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.GetUserTransactionsRes getUserTransfers(io.lightcone.data.dex.GetUserTransactionsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_TRANSFERS, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.UInt32Value getNextOrderId(io.lightcone.data.dex.GetNextOrderIdReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NEXT_ORDER_ID, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.UInt32Value getNonce(com.google.protobuf.UInt32Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NONCE, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.SubmitOrderRes submitOrder(io.lightcone.data.order.Order request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBMIT_ORDER, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.CancelOrderRes cancelOrder(io.lightcone.data.dex.SimpleOrderCancellationReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_ORDER, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.CancelOrderRes submitOrderCancellation(io.lightcone.data.requests.OrderCancellationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBMIT_ORDER_CANCELLATION, getCallOptions(), request);
    }

    @java.lang.Override
    public io.lightcone.data.dex.OffchainWithdrawalalRes submitOffchainWithdrawal(io.lightcone.data.requests.OffchainWithdrawalRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBMIT_OFFCHAIN_WITHDRAWAL, getCallOptions(), request);
    }
  }

  public static class DexServiceFutureStub extends io.grpc.stub.AbstractStub<DexServiceFutureStub>
      implements DexServiceFutureClient {
    private DexServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DexServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DexServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DexServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.DexConfigurations> getDexConfigurations(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEX_CONFIGURATIONS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetTokensRes> getTokens(
        io.lightcone.data.dex.GetTokensReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOKENS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetMarketsRes> getMarkets(
        io.lightcone.data.dex.GetMarketsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MARKETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetFillsRes> getMarketFills(
        io.lightcone.data.dex.GetMarketFillsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MARKET_FILLS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.OrderBook> getOrderBook(
        io.lightcone.data.dex.GetOrderBookReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER_BOOK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.Candles> getCandles(
        io.lightcone.data.dex.GetCandlesReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CANDLES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.Account> getAccount(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetUserOrdersRes> getUserOrders(
        io.lightcone.data.dex.GetUserOrdersReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_ORDERS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetFillsRes> getUserFills(
        io.lightcone.data.dex.GetUserFillsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_FILLS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.GetUserTransactionsRes> getUserTransfers(
        io.lightcone.data.dex.GetUserTransactionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_TRANSFERS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.UInt32Value> getNextOrderId(
        io.lightcone.data.dex.GetNextOrderIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NEXT_ORDER_ID, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.UInt32Value> getNonce(
        com.google.protobuf.UInt32Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NONCE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.SubmitOrderRes> submitOrder(
        io.lightcone.data.order.Order request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_ORDER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.CancelOrderRes> cancelOrder(
        io.lightcone.data.dex.SimpleOrderCancellationReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_ORDER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.CancelOrderRes> submitOrderCancellation(
        io.lightcone.data.requests.OrderCancellationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_ORDER_CANCELLATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.lightcone.data.dex.OffchainWithdrawalalRes> submitOffchainWithdrawal(
        io.lightcone.data.requests.OffchainWithdrawalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_OFFCHAIN_WITHDRAWAL, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEX_CONFIGURATIONS = 0;
  private static final int METHODID_GET_TOKENS = 1;
  private static final int METHODID_GET_MARKETS = 2;
  private static final int METHODID_GET_MARKET_FILLS = 3;
  private static final int METHODID_GET_ORDER_BOOK = 4;
  private static final int METHODID_GET_CANDLES = 5;
  private static final int METHODID_GET_ACCOUNT = 6;
  private static final int METHODID_GET_USER_ORDERS = 7;
  private static final int METHODID_GET_USER_FILLS = 8;
  private static final int METHODID_GET_USER_TRANSFERS = 9;
  private static final int METHODID_GET_NEXT_ORDER_ID = 10;
  private static final int METHODID_GET_NONCE = 11;
  private static final int METHODID_SUBMIT_ORDER = 12;
  private static final int METHODID_CANCEL_ORDER = 13;
  private static final int METHODID_SUBMIT_ORDER_CANCELLATION = 14;
  private static final int METHODID_SUBMIT_OFFCHAIN_WITHDRAWAL = 15;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DexService serviceImpl;
    private final int methodId;

    public MethodHandlers(DexService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEX_CONFIGURATIONS:
          serviceImpl.getDexConfigurations((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.DexConfigurations>) responseObserver);
          break;
        case METHODID_GET_TOKENS:
          serviceImpl.getTokens((io.lightcone.data.dex.GetTokensReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetTokensRes>) responseObserver);
          break;
        case METHODID_GET_MARKETS:
          serviceImpl.getMarkets((io.lightcone.data.dex.GetMarketsReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetMarketsRes>) responseObserver);
          break;
        case METHODID_GET_MARKET_FILLS:
          serviceImpl.getMarketFills((io.lightcone.data.dex.GetMarketFillsReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetFillsRes>) responseObserver);
          break;
        case METHODID_GET_ORDER_BOOK:
          serviceImpl.getOrderBook((io.lightcone.data.dex.GetOrderBookReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.OrderBook>) responseObserver);
          break;
        case METHODID_GET_CANDLES:
          serviceImpl.getCandles((io.lightcone.data.dex.GetCandlesReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.Candles>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.Account>) responseObserver);
          break;
        case METHODID_GET_USER_ORDERS:
          serviceImpl.getUserOrders((io.lightcone.data.dex.GetUserOrdersReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetUserOrdersRes>) responseObserver);
          break;
        case METHODID_GET_USER_FILLS:
          serviceImpl.getUserFills((io.lightcone.data.dex.GetUserFillsReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetFillsRes>) responseObserver);
          break;
        case METHODID_GET_USER_TRANSFERS:
          serviceImpl.getUserTransfers((io.lightcone.data.dex.GetUserTransactionsReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.GetUserTransactionsRes>) responseObserver);
          break;
        case METHODID_GET_NEXT_ORDER_ID:
          serviceImpl.getNextOrderId((io.lightcone.data.dex.GetNextOrderIdReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.UInt32Value>) responseObserver);
          break;
        case METHODID_GET_NONCE:
          serviceImpl.getNonce((com.google.protobuf.UInt32Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.UInt32Value>) responseObserver);
          break;
        case METHODID_SUBMIT_ORDER:
          serviceImpl.submitOrder((io.lightcone.data.order.Order) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.SubmitOrderRes>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((io.lightcone.data.dex.SimpleOrderCancellationReq) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.CancelOrderRes>) responseObserver);
          break;
        case METHODID_SUBMIT_ORDER_CANCELLATION:
          serviceImpl.submitOrderCancellation((io.lightcone.data.requests.OrderCancellationRequest) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.CancelOrderRes>) responseObserver);
          break;
        case METHODID_SUBMIT_OFFCHAIN_WITHDRAWAL:
          serviceImpl.submitOffchainWithdrawal((io.lightcone.data.requests.OffchainWithdrawalRequest) request,
              (io.grpc.stub.StreamObserver<io.lightcone.data.dex.OffchainWithdrawalalRes>) responseObserver);
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
      final DexService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_DEX_CONFIGURATIONS,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              io.lightcone.data.dex.DexConfigurations>(
                serviceImpl, METHODID_GET_DEX_CONFIGURATIONS)))
        .addMethod(
          METHOD_GET_TOKENS,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetTokensReq,
              io.lightcone.data.dex.GetTokensRes>(
                serviceImpl, METHODID_GET_TOKENS)))
        .addMethod(
          METHOD_GET_MARKETS,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetMarketsReq,
              io.lightcone.data.dex.GetMarketsRes>(
                serviceImpl, METHODID_GET_MARKETS)))
        .addMethod(
          METHOD_GET_MARKET_FILLS,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetMarketFillsReq,
              io.lightcone.data.dex.GetFillsRes>(
                serviceImpl, METHODID_GET_MARKET_FILLS)))
        .addMethod(
          METHOD_GET_ORDER_BOOK,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetOrderBookReq,
              io.lightcone.data.dex.OrderBook>(
                serviceImpl, METHODID_GET_ORDER_BOOK)))
        .addMethod(
          METHOD_GET_CANDLES,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetCandlesReq,
              io.lightcone.data.dex.Candles>(
                serviceImpl, METHODID_GET_CANDLES)))
        .addMethod(
          METHOD_GET_ACCOUNT,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              io.lightcone.data.dex.Account>(
                serviceImpl, METHODID_GET_ACCOUNT)))
        .addMethod(
          METHOD_GET_USER_ORDERS,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetUserOrdersReq,
              io.lightcone.data.dex.GetUserOrdersRes>(
                serviceImpl, METHODID_GET_USER_ORDERS)))
        .addMethod(
          METHOD_GET_USER_FILLS,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetUserFillsReq,
              io.lightcone.data.dex.GetFillsRes>(
                serviceImpl, METHODID_GET_USER_FILLS)))
        .addMethod(
          METHOD_GET_USER_TRANSFERS,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetUserTransactionsReq,
              io.lightcone.data.dex.GetUserTransactionsRes>(
                serviceImpl, METHODID_GET_USER_TRANSFERS)))
        .addMethod(
          METHOD_GET_NEXT_ORDER_ID,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.GetNextOrderIdReq,
              com.google.protobuf.UInt32Value>(
                serviceImpl, METHODID_GET_NEXT_ORDER_ID)))
        .addMethod(
          METHOD_GET_NONCE,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.UInt32Value,
              com.google.protobuf.UInt32Value>(
                serviceImpl, METHODID_GET_NONCE)))
        .addMethod(
          METHOD_SUBMIT_ORDER,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.order.Order,
              io.lightcone.data.dex.SubmitOrderRes>(
                serviceImpl, METHODID_SUBMIT_ORDER)))
        .addMethod(
          METHOD_CANCEL_ORDER,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.dex.SimpleOrderCancellationReq,
              io.lightcone.data.dex.CancelOrderRes>(
                serviceImpl, METHODID_CANCEL_ORDER)))
        .addMethod(
          METHOD_SUBMIT_ORDER_CANCELLATION,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.requests.OrderCancellationRequest,
              io.lightcone.data.dex.CancelOrderRes>(
                serviceImpl, METHODID_SUBMIT_ORDER_CANCELLATION)))
        .addMethod(
          METHOD_SUBMIT_OFFCHAIN_WITHDRAWAL,
          asyncUnaryCall(
            new MethodHandlers<
              io.lightcone.data.requests.OffchainWithdrawalRequest,
              io.lightcone.data.dex.OffchainWithdrawalalRes>(
                serviceImpl, METHODID_SUBMIT_OFFCHAIN_WITHDRAWAL)))
        .build();
  }
}
