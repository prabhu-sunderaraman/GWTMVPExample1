package com.durasoft.client.presenter;

import com.durasoft.client.events.CountryCallback;
import com.durasoft.client.ui.CountryFormPanel;
import com.durasoft.shared.CountryService;
import com.durasoft.shared.CountryServiceAsync;
import com.durasoft.shared.model.Country;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Panel;

public class MVPPresenter {
	private CountryFormPanel countryFormPanel;
	private CountryServiceAsync countryService;
	
	public MVPPresenter(Panel container){
		countryFormPanel = new CountryFormPanel();
		countryFormPanel.setCountryCallback(new CountryCallbackImpl());
		countryService = GWT.create(CountryService.class);
		container.add(countryFormPanel);
	}
	private class CountryCallbackImpl implements CountryCallback{
		public void computeCapital(String countryName) {
			countryService.getCapital(countryName, new AsyncCallback<Country>() {
				public void onSuccess(Country result) {
					countryFormPanel.setInfo("Capital is " + result.getCapital());
				}
				public void onFailure(Throwable caught) {
					countryFormPanel.setInfo("Error loading info " + caught.getMessage());
				}
			});
			
		}
		
	}
	
	
}
