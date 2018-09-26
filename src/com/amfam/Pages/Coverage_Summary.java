package com.amfam.Pages;

import org.xframium.page.Page;

public interface Coverage_Summary extends Page {

	@ElementDefinition
    public String BUYNOW = "BUYNOW";	
	
	@TimeMethod
	@ScreenShot
	public boolean setCoverageSummary();
}
