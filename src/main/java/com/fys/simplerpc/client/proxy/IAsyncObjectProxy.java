package com.fys.simplerpc.client.proxy;

import com.fys.simplerpc.client.RPCFuture;

public interface IAsyncObjectProxy {

  public RPCFuture call(String funcName, Object... args);

}
