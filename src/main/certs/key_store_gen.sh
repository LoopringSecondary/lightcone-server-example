#!/bin/bash
NAME=$1
keytool -genkey -alias mydomain -keyalg RSA -keystore $NAME"keystore.jks" -keysize 2048
