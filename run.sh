#!/bin/bash

kubectl delete svc hello
kubectl delete deploy hello


kubectl create -f kubernetes/hello-demo.yaml