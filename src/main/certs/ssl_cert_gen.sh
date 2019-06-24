#!/bin/bash

# keystore location:
#  /Library/Java/JavaVirtualMachines/jdk1.8.0_74.jdk/Contents/Home/jre/lib/security/cacerts

# Generate .crt file
# link -> http://serverfault.com/questions/224122/what-is-crt-and-key-and-how-can-i-generate-them

NAME=$1

#openssl genrsa 1024 > $NAME"server.key"
openssl genrsa -des3 -out $NAME"private.pem" 2048
openssl rsa -in $NAME"private.pem" -outform PEM -pubout -out $NAME"public.pem"
chmod 400 $NAME"private.pem"
chmod 400 $NAME"public.pem"
openssl req -new -x509 -nodes -sha1 -days 365 -key $NAME"private.pem" > $NAME"selfsigned.crt"

# Importing the private-key/public-certificate pair in the Java KeyStore
# link -> http://stackoverflow.com/questions/17695297/importing-the-private-key-public-certificate-pair-in-the-java-keystore

# Create PKCS12 keystore from private key and public certificate.
openssl pkcs12 -export -name $NAME"servercert" -in $NAME"selfsigned.crt" -inkey $NAME"private.pem" -out $NAME"keystore.p12"

# Convert PKCS12 keystore into a JKS keystore
keytool -importkeystore -destkeystore $NAME"keystore.jks" -srckeystore $NAME"keystore.p12" -srcstoretype pkcs12 -alias $NAME"servercert"

#To verify the contents of the JKS, you can use this command:
keytool -list -v -keystore $NAME"keystore.jks"
