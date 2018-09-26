package com.amfam.Pages;

import org.xframium.page.Page;
import org.xframium.page.Page.ScreenShot;
import org.xframium.page.Page.TimeMethod;


public interface Additional_Info extends Page {
	
	@ElementDefinition
    public String NEXT_AI = "NEXT_AI";
	
	@TimeMethod
	@ScreenShot
	public boolean setAdditionalInfo();

}
