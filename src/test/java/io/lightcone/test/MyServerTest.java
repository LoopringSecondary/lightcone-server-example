package io.lightcone.test;

import java.util.concurrent.ExecutionException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.UInt32Value;

import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.lightcone.data.dex.DexServiceGrpc;
import io.lightcone.data.dex.GetNextOrderIdReq;
import io.lightcone.data.dex.MyServer;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class MyServerTest {

    private static final String HOST = "localhost";

    private static final int PORT = 19880;

    private static final NegotiationType DEFAULT_NEGOTIATIONTYPE = NegotiationType.PLAINTEXT;

    private MyServer server;

    @Before
    public void setUp() throws Exception {
        server = new MyServer(PORT);
        server.start();
    }

    @After
    public void tearDown() {
        server.stop();
    }

    @Test
    public void testGetNextOrderId() {
        final ManagedChannel channel = NettyChannelBuilder
                .forAddress(HOST, PORT)
                .negotiationType(DEFAULT_NEGOTIATIONTYPE)
                .build();
        DexServiceGrpc.DexServiceFutureClient client = DexServiceGrpc.newFutureStub(channel);
        GetNextOrderIdReq request = GetNextOrderIdReq.newBuilder().setAccountId(1L).build();
        ListenableFuture<UInt32Value> listenableFuture = client.getNextOrderId(request);

        try {
            final UInt32Value nextOrderId = listenableFuture.get();
            assertEquals(10, nextOrderId.getValue());
        } catch (InterruptedException | ExecutionException e) {
            log.error(e.getMessage(), e);
        }
    }
}
