/*
  Created with IntelliJ IDEA.
  User: kenshin wangchen@loopring.org
  Time: 2019-06-22 12:01
  Cooperation: loopring.org 路印协议基金会
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
import io.lightcone.data.types.Market;
import io.lightcone.data.types.MarketMetadata;
import io.lightcone.data.types.Token;
import io.lightcone.data.types.TokenInfo;
import io.lightcone.data.types.TokenMetadata;

public class DexServiceImpl implements DexServiceGrpc.DexService {

    @Override
    public void getDexConfigurations(Empty request, StreamObserver<DexConfigurations> responseObserver) {
        DexConfigurations dexConfigurations = DexConfigurations.newBuilder()
                .setDexId(1)
                .setDexAddress("0x1234567890123456")
                .setDepositFeeEth("0x124567000000000000000")
                .build();
        responseObserver.onNext(dexConfigurations);
        responseObserver.onCompleted();
    }

    @Override
    public void getTokens(GetTokensReq request, StreamObserver<GetTokensRes> responseObserver) {
        Token token = Token.newBuilder()
                .setMetadata(TokenMetadata.newBuilder()
                        .setAddress("")
                        .setPrecision(18)
                        .build())
                .setInfo(TokenInfo.newBuilder()
                        .setSymbol("LRC")
                        .build())
                .build();
        GetTokensRes response = GetTokensRes.newBuilder().addTokens(token).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMarkets(GetMarketsReq request, StreamObserver<GetMarketsRes> responseObserver) {
        Market market = Market.newBuilder()
                .setMetadata(MarketMetadata.newBuilder()
                        .setMarketId(0x0000000100000002L)
                        .setPriceDecimals(8)
                        .build())
                .build();
        GetMarketsRes response = GetMarketsRes.newBuilder().addMarkets(market).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMarketFills(GetMarketFillsReq request, StreamObserver<GetFillsRes> responseObserver) {
    }

    @Override
    public void getOrderBook(GetOrderBookReq request, StreamObserver<OrderBook> responseObserver) {
    }

    @Override
    public void getCandles(GetCandlesReq request, StreamObserver<Candles> responseObserver) {
        Candles.OHLC ohlc = Candles.OHLC.newBuilder()
                .addOhlc(2.0d) // open
                .addOhlc(4.0d) // high
                .addOhlc(1.0d) // low
                .addOhlc(3.0d) // close
                .build();
        Candles candles = Candles.newBuilder()
                .addData(ohlc)
                .build();
        responseObserver.onNext(candles);
        responseObserver.onCompleted();
    }

    @Override
    public void getAccount(StringValue request, StreamObserver<Account> responseObserver) {
        responseObserver.onNext(Account.newBuilder()
                .setAccountId(AccountID.newBuilder()
                        .setValue(1)
                        .build())
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
        UserTransaction userTx = UserTransaction.newBuilder()
                .setAccountId(1)
                .setRequestId(1)
                .setTokenId(1)
                .setAmount("0.009")
                .setSubmittedAt(123456789)
                .setUpdatedAt(123456789)
                .setAccountId(1)
                .build();
        responseObserver.onNext(GetUserTransactionsRes.newBuilder()
                .addTransactions(userTx)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getNextOrderId(GetNextOrderIdReq request, StreamObserver<UInt32Value> responseObserver) {
        responseObserver.onNext(UInt32Value.newBuilder()
                .setValue(10)
                .build());
        responseObserver.onCompleted();
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
        responseObserver.onNext(CancelOrderRes.newBuilder()
                .addOrderUuids(0)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void submitOrderCancellation(OrderCancellationRequest request, StreamObserver<CancelOrderRes> responseObserver) {

    }

    @Override
    public void submitOffchainWithdrawal(OffchainWithdrawalRequest request, StreamObserver<OffchainWithdrawalalRes> responseObserver) {
        responseObserver.onNext(OffchainWithdrawalalRes.newBuilder()
                .setWithdrwalUuid(0)
                .build());
        responseObserver.onCompleted();
    }
}
