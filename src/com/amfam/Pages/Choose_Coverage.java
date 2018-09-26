package com.amfam.Pages;

import org.xframium.page.Page;


public interface Choose_Coverage extends Page{

	@ElementDefinition
    public String NEXT_COV = "NEXT_COV";
	
	@TimeMethod
	@ScreenShot
	public boolean chooseCoverage();
	
}
