package com.dnsimple;

import com.dnsimple.data.OauthToken;
import com.dnsimple.exception.DnsimpleException;

import java.io.IOException;
import java.util.Map;

/**
 * Provides access to the DNSimple OAuth API.
 *
 * @see <a href="https://developer.dnsimple.com/v2/oauth">https://developer.dnsimple.com/v2/oauth</a>
 */
public interface Oauth {

  /**
   * Exchange the short-lived authorization code for an access token
   * that is used to authenticate API calls.
   *
   * @see <a href="https://developer.dnsimple.com/v2/oauth">https://developer.dnsimple.com/v2/oauth</a>
   *
   * @param code The authorization code
   * @param clientId The client ID
   * @param clientSecret The client secret
   * @return The OauthToken instance
   * @throws DnsimpleException Any API error
   * @throws IOException Any IO error
   */
  public OauthToken exchangeAuthorizationForToken(String code, String clientId, String clientSecret) throws DnsimpleException, IOException;

  /**
   * Exchange the short-lived authorization code for an access token
   * that is used to authenticate API calls.
   *
   * @see <a href="https://developer.dnsimple.com/v2/oauth">https://developer.dnsimple.com/v2/oauth</a>
   *
   * @param code The authorization code
   * @param clientId The client ID
   * @param clientSecret The client secret
   * @param options Map of options
   * @return The OauthToken instance
   * @throws DnsimpleException Any API error
   * @throws IOException Any IO error
   */
  public OauthToken exchangeAuthorizationForToken(String code, String clientId, String clientSecret, Map<String, Object> options) throws DnsimpleException, IOException;

  /**
   * Gets the URL to authorize a user for an application via the OAuth2 flow.
   *
   * @see <a href="https://developer.dnsimple.com/v2/oauth/">https://developer.dnsimple.com/v2/oauth/</a>
   *
   * @param clientId The client ID of the OAuth app in DNSimple
   * @return The authorize URL String
   */
  public String authorizeUrl(String clientId);

  /**
   * Gets the URL to authorize a user for an application via the OAuth2 flow.
   *
   * @see <a href="https://developer.dnsimple.com/v2/oauth/">https://developer.dnsimple.com/v2/oauth/</a>
   *
   * @param clientId The client ID of the OAuth app in DNSimple
   * @param options A Map of options to include as parameters in the generated URL
   * @return The authorize URL string
   */
  public String authorizeUrl(String clientId, Map<Object, Object> options);
}
