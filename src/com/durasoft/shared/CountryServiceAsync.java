package com.durasoft.shared;

import com.durasoft.shared.model.Country;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CountryServiceAsync {
	void getCapital(String country, AsyncCallback<Country> callback);
}
