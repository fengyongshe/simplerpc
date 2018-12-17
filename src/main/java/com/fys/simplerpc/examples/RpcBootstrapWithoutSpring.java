package com.fys.testsimplerpc;

import com.fys.simplerpc.registry.ServiceRegistry;
import com.fys.simplerpc.server.RpcServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RpcBootstrapWithoutSpring {
  private static final Logger logger = LoggerFactory.getLogger(RpcBootstrapWithoutSpring.class);

  public static void main(String[] args) {
    String serverAddress = "127.0.0.1:18866";
    ServiceRegistry serviceRegistry = new ServiceRegistry("10.139.4.83:2181");
    RpcServer rpcServer = new RpcServer(serverAddress, serviceRegistry);
    HelloService helloService = new HelloServiceImpl();
    rpcServer.addService("com.fys.testsimplerpc.HelloService", helloService);
    try {
      rpcServer.start();
    } catch (Exception ex) {
      logger.error("Exception: {}", ex);
    }
  }
}
