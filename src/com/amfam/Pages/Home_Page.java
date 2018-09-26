package com.amfam.Pages;

import org.xframium.page.Page;

public interface Home_Page extends Page {


	@ElementDefinition
    public String ZIP = "ZIP";
	
	@ElementDefinition
    public String START_QUOTING_BUTTON = "START_QUOTING_BUTTON";
	
	@TimeMethod
	@ScreenShot
	public boolean startQuote();
	
}
