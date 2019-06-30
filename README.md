# lightcone-server-example

This project is an example implementation of Java **gRPC** server for relay api. <br />

Server exposes three different services:
- a mock service **DexService** which always responds using the mock message


# How to build a jar?
```
mvn package
```

# How to deploy?
```
scp -i ~/mock-server.pem target/lightcone-server-example-1.0.0-SNAPSHOT.jar ec2-user@ec2-18-179-197-168.ap-northeast-1.compute.amazonaws.com:
```
We use EC2 directly since Elastic beanstalk can't support gRPC very easily.

# How to install Java 8 on AWS AMI?
```
sudo yum install java-1.8.0
sudo yum remove java-1.7.0-openjdk
```
