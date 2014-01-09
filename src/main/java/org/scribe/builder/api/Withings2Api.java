package org.scribe.builder.api;

import org.scribe.model.Token;
import org.scribe.model.Verb;

public class Withings2Api extends DefaultApi10a
{
  private static final String AUTHORIZATION_URL = "https://oauth.withings.com/account/authorize";
  
  @Override
  public String getAccessTokenEndpoint()
  {
    return "https://oauth.withings.com/account/access_token";
  }

  @Override
  public String getRequestTokenEndpoint()
  {
    return "https://oauth.withings.com/account/request_token";
  }
  
  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZATION_URL, requestToken.getToken());
  }
  
  @Override
  public Verb getRequestTokenVerb()
  {
    return Verb.GET;
  }

  @Override
  public Verb getAccessTokenVerb()
  {
    return Verb.GET;
  }  
}
