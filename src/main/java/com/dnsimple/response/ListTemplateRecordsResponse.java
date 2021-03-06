package com.dnsimple.response;

import com.dnsimple.data.TemplateRecord;
import com.dnsimple.data.Pagination;

import java.util.List;

import com.google.api.client.util.Key;

public class ListTemplateRecordsResponse extends ApiResponse {
  @Key("data")
  private List<TemplateRecord> data;

  @Key("pagination")
  private Pagination pagination;

  public List<TemplateRecord> getData() {
    return data;
  }

  public Pagination getPagination() {
    return pagination;
  }
}
