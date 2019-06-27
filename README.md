# lightcone-server-example

This project is an example implementation of Java **gRPC** server for relay api. <br />

Server exposes three different services:
- a mock service **DexService** which always responds using the mock message


# How to deploy?
We use EC2 directly since Elastic beanstalk can't support gRPC very easily.


# How to install Java 8 on AWS AMI?
```
sudo yum install java-1.8.0
sudo yum remove java-1.7.0-openjdk
```
