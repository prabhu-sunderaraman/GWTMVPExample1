package com.durasoft.client;

import com.durasoft.client.presenter.MVPPresenter;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class SampleEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		MVPPresenter presenter = new MVPPresenter(RootPanel.get());
	}
}
