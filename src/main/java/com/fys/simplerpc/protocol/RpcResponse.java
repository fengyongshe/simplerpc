package com.fys.simplerpc.protocol;

import lombok.Data;

@Data
public class RpcResponse {

  private String requestId;
  private String error;
  private Object result;

  public boolean isError() {
    return error != null;
  }

}
