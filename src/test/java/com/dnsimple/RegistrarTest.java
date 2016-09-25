package com.dnsimple;

import com.dnsimple.request.Filter;
import com.dnsimple.response.CheckDomainResponse;
import com.dnsimple.response.RegisterDomainResponse;
import com.dnsimple.exception.DnsimpleException;
import com.dnsimple.exception.ResourceNotFoundException;

import java.io.IOException;
import java.util.List;
import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.util.Data;

public class RegistrarTest extends DnsimpleTestBase {

  @Test
  public void testCheckDomain() throws DnsimpleException, IOException {
    String accountId = "1010";
    String name = "example.com";

    Client client = mockAndExpectClient("https://api.dnsimple.com/v2/1010/registrar/domains/example.com/check", HttpMethods.GET, null, resource("checkDomain/success.http"));

    CheckDomainResponse response = client.registrar.checkDomain(accountId, name);
    DomainAvailability availability = response.getData();
    assertEquals(name, availability.getDomainName());
    assertTrue(availability.getAvailable().booleanValue());
    assertFalse(availability.getPremium().booleanValue());
  }

  @Test
  public void testRegisterDomain() throws DnsimpleException, IOException {
    String accountId = "1010";
    String name = "example.com";
    HashMap<String, Object> attributes = new HashMap<String, Object>();
    attributes.put("registrant_id", "10");

    Client client = mockAndExpectClient("https://api.dnsimple.com/v2/1010/registrar/domains/example.com/register", HttpMethods.POST, attributes, resource("registerDomain/success.http"));

    RegisterDomainResponse response = client.registrar.registerDomain(accountId, name, attributes);
    Domain domain = response.getData();
    assertEquals(1, domain.getId().intValue());
    assertEquals(1010, domain.getAccountId().intValue());
    assertEquals(2, domain.getRegistrantId().intValue());
    assertEquals("example.com", domain.getName());
    assertEquals("example.com", domain.getUnicodeName());
    assertEquals("cc8h1jP8bDLw5rXycL16k8BivcGiT6K9", domain.getToken());
    assertEquals("registered", domain.getState());
    assertFalse(domain.getAutoRenew());
    assertFalse(domain.getPrivateWhois());
    assertEquals("2017-01-16", domain.getExpiresOn());
    assertEquals("2016-01-16T16:08:50.649Z", domain.getCreatedAt());
    assertEquals("2016-01-16T16:09:01.161Z", domain.getUpdatedAt());
  }

}
