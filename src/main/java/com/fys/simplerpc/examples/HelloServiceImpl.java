package com.fys.testsimplerpc;

import com.fys.simplerpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

  public HelloServiceImpl(){

  }

  public String hello(String name) {
    return "Hello! " + name;
  }
}
