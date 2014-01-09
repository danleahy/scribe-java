package org.scribe.builder.api;

import org.scribe.model.*;

public class WithingsApi extends DefaultApi10a {
	  private static final String AUTHORIZE_URL = "https://oauth.withings.com/account/authorize";

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
	    return String.format(AUTHORIZE_URL, requestToken.getToken());
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