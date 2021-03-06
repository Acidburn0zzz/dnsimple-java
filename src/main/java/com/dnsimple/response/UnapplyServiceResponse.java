package com.dnsimple.response;

import com.dnsimple.data.Service;

import com.google.api.client.util.Key;

public class UnapplyServiceResponse extends ApiResponse {
  @Key("data")
  private Service data;

  public Service getData() {
    return data;
  }
}
