package com.durasoft.client.ui;

import com.durasoft.client.events.CountryCallback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class CountryFormPanel extends Composite {

	@UiField TextBox countryTextBox;
	@UiField Button getInfoButton;
	@UiField Label infoLabel;
	
	private static CountryFormPanelUiBinder uiBinder = GWT
			.create(CountryFormPanelUiBinder.class);

	interface CountryFormPanelUiBinder extends
			UiBinder<Widget, CountryFormPanel> {
	}

	public CountryFormPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		
		getInfoButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String country = countryTextBox.getText();
				countryCallback.computeCapital(country);
			}
		});
	}
	public void setInfo(String info) {
		infoLabel.setText(info);
	}
	private CountryCallback countryCallback;
	public void setCountryCallback(CountryCallback countryCallback) {
		this.countryCallback = countryCallback;
	}

}
