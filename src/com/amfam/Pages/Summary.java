package com.amfam.Pages;

import org.xframium.page.Page;

public interface Summary  extends Page {
	
	@ElementDefinition
    public String NEXT_SUMMARY = "NEXT_SUMMARY";
	
	@TimeMethod
	@ScreenShot
	public boolean setSummary();

}
