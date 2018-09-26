package com.amfam.Pages;

import org.xframium.page.Page;

public interface Sign  extends Page {
	
	@ElementDefinition
    public String REVIEW = "REVIEW";
	
	@TimeMethod
	@ScreenShot
	public boolean setSign();

}
