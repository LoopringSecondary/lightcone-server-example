# grpc-demo

This project is an example implementation of Java **gRPC** server. <br />
Unit tests contain a set of test cases dedicated for each end-point provided by a server. Each test case implements a specific gRPC client. <br />

Server exposes three different services:
- a trivial service **"Hello, World"** which always responds using the same message
- a trivial **"Echo"** service which responds using request messages
- a not trivial **"Sequence Number"** which responds using **streaming** with a specified length
