package com.durasoft.server;

import com.durasoft.shared.CountryService;
import com.durasoft.shared.model.Country;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class CountryServiceImpl extends RemoteServiceServlet implements CountryService{

	public Country getCapital(String countryName) {
		String capital = "Unknown";
		if("India".equalsIgnoreCase(countryName))
			capital = "New Delhi";
		else if("USA".equalsIgnoreCase(countryName))
			capital = "Washington, D.C";
		return new Country(countryName,capital);
	}
}
