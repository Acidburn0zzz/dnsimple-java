package com.dnsimple;

import com.dnsimple.response.EnableVanityNameServersResponse;
import com.dnsimple.response.DisableVanityNameServersResponse;
import com.dnsimple.exception.DnsimpleException;

import java.io.IOException;

/**
 * Provides access to the  DNSimple Vanity Name Server API
 *
 * @see <a href="https://developer.dnsimple.com/v2/domains/vanity">https://developer.dnsimple.com/v2/domains/vanity</a>
 */
public interface VanityNameServers {

  /**
   * Enable vanity name servers for the domain
   *
   * @see <a href="https://developer.dnsimple.com/v2/domains/vanity/#enable">https://developer.dnsimple.com/v2/domains/vanity/#enable</a>
   * @param accountId The account ID
   * @param domainId The domain name or ID
   * @return The enable vanity name server response
   * @throws DnsimpleException Any API error
   * @throws IOException Any IO error
   */
  public EnableVanityNameServersResponse enableVanityNameServers(String accountId, String domainId) throws DnsimpleException, IOException;

  /**
   * Disable vanity name servers for the domain
   *
   * @see <a href="https://developer.dnsimple.com/v2/domains/vanity/#disable">https://developer.dnsimple.com/v2/domains/vanity/#disable</a>
   * @param accountId The account ID
   * @param domainId The domain name or ID
   * @return The disable vanity name server response
   * @throws DnsimpleException Any API error
   * @throws IOException Any IO error
   */
  public DisableVanityNameServersResponse disableVanityNameServers(String accountId, String domainId) throws DnsimpleException, IOException;

}
