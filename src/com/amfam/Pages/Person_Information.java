package com.amfam.Pages;

import org.xframium.page.Page;


public interface Person_Information extends Page {
	
	@ElementDefinition
    public String GENDER = "GENDER";	
	
	@ElementDefinition
    public String MARITALSTATUS = "MARITALSTATUS";	
	
	@ElementDefinition
    public String EMPLOYMENT = "EMPLOYMENT";
	
	@ElementDefinition
    public String NEXT_PI = "NEXT_PI";
	
	@TimeMethod
	@ScreenShot
	public boolean setPersonInfo();

}
