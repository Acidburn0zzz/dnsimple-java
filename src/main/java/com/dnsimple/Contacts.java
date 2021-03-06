package com.dnsimple;

import com.dnsimple.response.ListContactsResponse;
import com.dnsimple.response.GetContactResponse;
import com.dnsimple.response.CreateContactResponse;
import com.dnsimple.response.UpdateContactResponse;
import com.dnsimple.response.DeleteContactResponse;
import com.dnsimple.exception.DnsimpleException;

import java.io.IOException;
import java.util.Map;

/**
 * Provides access to the DNSimple Contacts API.
 *
 * @see <a href="https://developer.dnsimple.com/v2/contacts">https://developer.dnsimple.com/v2/contacts</a>
 */
public interface Contacts {

  /**
   * Lists the contacts in the account.
   *
   * @see <a href="https://developer.dnsimple.com/v2/contacts/#list">https://developer.dnsimple.com/v2/contacts/#list</a>
   *
   * @param accountId The account ID
   * @return The list contacts response
   * @throws DnsimpleException Any API errors
   * @throws IOException Any IO errors
   */
  public ListContactsResponse listContacts(String accountId) throws DnsimpleException, IOException;

  /**
   * Lists the contacts in the account.
   *
   * @see <a href="https://developer.dnsimple.com/v2/contacts/#list">https://developer.dnsimple.com/v2/contacts/#list</a>
   *
   * @param accountId The account ID
   * @param options A Map of options to pass to the contacts API
   * @return The list contacts response
   * @throws DnsimpleException Any API errors
   * @throws IOException Any IO errors
   */
  public ListContactsResponse listContacts(String accountId, Map<String,Object> options) throws DnsimpleException, IOException;

  /**
   * Get a specific contact associated to an account using the contacts's ID.
   *
   * @see <a href="https://developer.dnsimple.com/v2/contacts/#get">https://developer.dnsimple.com/v2/contacts/#get</a>
   *
   * @param accountId The account ID
   * @param contactId The contact ID
   * @return The get contact response
   * @throws DnsimpleException Any API errors
   * @throws IOException Any IO errors
   */
  public GetContactResponse getContact(String accountId, String contactId) throws DnsimpleException, IOException;

  /**
   * Create a contact in the account.
   *
   * @see <a href="https://developer.dnsimple.com/v2/contacts/#create">https://developer.dnsimple.com/v2/contacts/#create</a>
   *
   * @param accountId The account ID
   * @param attributes A map of attributes to contruct the contact
   * @return The create contact response
   * @throws DnsimpleException Any API errors
   * @throws IOException Any IO errors
   */
  public CreateContactResponse createContact(String accountId, Map<String,Object> attributes) throws DnsimpleException, IOException;

  /**
   * Update a contact in the account.
   *
   * @see <a href="https://developer.dnsimple.com/v2/contacts/#update">https://developer.dnsimple.com/v2/contacts/#update</a>
   *
   * @param accountId The account ID
   * @param contactId The contact ID
   * @param attributes A map of attributes to update the contact
   * @return The update contact response
   * @throws DnsimpleException Any API errors
   * @throws IOException Any IO errors
   */
  public UpdateContactResponse updateContact(String accountId, String contactId, Map<String,Object> attributes) throws DnsimpleException, IOException;

  /**
   * Delete a contact from the account.
   *
   * @see <a href="https://developer.dnsimple.com/v2/contacts/#delete">https://developer.dnsimple.com/v2/contacts/#delete</a>
   *
   * @param accountId The account ID
   * @param contactId The contact ID
   * @return The delete contact response
   * @throws DnsimpleException Any API errors
   * @throws IOException Any IO errors
   */
  public DeleteContactResponse deleteContact(String accountId, String contactId) throws DnsimpleException, IOException;

}
