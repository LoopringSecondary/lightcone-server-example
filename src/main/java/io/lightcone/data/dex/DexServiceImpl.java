/**
 * Created with IntelliJ IDEA.
 * User: kenshin wangchen@loopring.org
 * Time: 2019-06-22 12:01
 * Cooperation: loopring.org 路印协议基金会
 */
package io.lightcone.data.dex;

import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;
import com.google.protobuf.UInt32Value;

import io.grpc.stub.StreamObserver;
import io.lightcone.data.order.Order;
import io.lightcone.data.requests.OffchainWithdrawalRequest;
import io.lightcone.data.requests.OrderCancellationRequest;
import io.lightcone.data.types.AccountID;

public class DexServiceImpl implements DexServiceGrpc.DexService {

    @Override
    public void getDexConfigurations(Empty request, StreamObserver<DexConfigurations> responseObserver) {
    }

    @Override
    public void getTokens(GetTokensReq request, StreamObserver<GetTokensRes> responseObserver) {
    }

    @Override
    public void getMarkets(GetMarketsReq request, StreamObserver<GetMarketsRes> responseObserver) {
    }

    @Override
    public void getMarketFills(GetMarketFillsReq request, StreamObserver<GetFillsRes> responseObserver) {
    }

    @Override
    public void getOrderBook(GetOrderBookReq request, StreamObserver<OrderBook> responseObserver) {
    }

    @Override
    public void getCandles(GetCandlesReq request, StreamObserver<Candles> responseObserver) {
    }

    @Override
    public void getAccount(StringValue request, StreamObserver<Account> responseObserver) {
        responseObserver.onNext(Account.newBuilder()
                .setAccountId(AccountID.newBuilder().setValue(1).build())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getUserOrders(GetUserOrdersReq request, StreamObserver<GetUserOrdersRes> responseObserver) {
    }

    @Override
    public void getUserFills(GetUserFillsReq request, StreamObserver<GetFillsRes> responseObserver) {
    }

    @Override
    public void getUserTransfers(GetUserTransactionsReq request, StreamObserver<GetUserTransactionsRes> responseObserver) {
    }

    @Override
    public void getNextOrderId(GetNextOrderIdReq request, StreamObserver<UInt32Value> responseObserver) {
    }

    @Override
    public void getNonce(UInt32Value request, StreamObserver<UInt32Value> responseObserver) {
        responseObserver.onNext(UInt32Value.newBuilder()
                .setValue(0)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void submitOrder(Order request, StreamObserver<SubmitOrderRes> responseObserver) {
        responseObserver.onNext(SubmitOrderRes.newBuilder()
                .setOrderUuid(0)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void cancelOrder(SimpleOrderCancellationReq request, StreamObserver<CancelOrderRes> responseObserver) {
    }

    @Override
    public void submitOrderCancellation(OrderCancellationRequest request, StreamObserver<CancelOrderRes> responseObserver) {
    }

    @Override
    public void submitOffchainWithdrawal(OffchainWithdrawalRequest request, StreamObserver<OffchainWithdrawalalRes> responseObserver) {
    }
}
