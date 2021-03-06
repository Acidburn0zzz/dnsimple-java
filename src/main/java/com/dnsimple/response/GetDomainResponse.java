package com.dnsimple.response;

import com.dnsimple.data.Domain;

import com.google.api.client.util.Key;

public class GetDomainResponse extends ApiResponse {
  @Key("data")
  private Domain data;

  public Domain getData() {
    return data;
  }
}
