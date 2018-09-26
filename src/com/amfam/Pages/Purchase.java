package com.amfam.Pages;

import org.xframium.page.Page;


public interface Purchase extends Page {
	
	@ElementDefinition
    public String Continue = "Continue";
	
	@TimeMethod
	@ScreenShot
	public boolean setPurchase();

}
