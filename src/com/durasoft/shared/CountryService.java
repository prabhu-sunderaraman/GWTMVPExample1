package com.durasoft.shared;

import com.durasoft.shared.model.Country;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("geo")
public interface CountryService extends RemoteService{
	Country getCapital(String countryName);
}
