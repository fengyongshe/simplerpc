package com.fys.testsimplerpc;

import com.fys.simplerpc.client.RpcClient;
import com.fys.simplerpc.registry.ServiceDiscovery;

public class RpcClientDemo {

  public static void main(String[] args) {
    ServiceDiscovery serviceDiscovery = new ServiceDiscovery("10.139.4.83:2181");
    RpcClient rpcClient = new RpcClient(serviceDiscovery);
    HelloService syncClient = rpcClient.create(HelloService.class);
    String result = syncClient.hello(Integer.toString(10));
    System.out.println("Result:"+ result);
  }
}
