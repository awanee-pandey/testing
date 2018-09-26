package com.amfam.Pages;


import org.xframium.page.Page;

public interface Information_Page extends Page {

		
	@ElementDefinition
    public String FIRSTNAME = "FIRSTNAME";
	
	@ElementDefinition
    public String LASTNAME = "LASTNAME";
	
	@ElementDefinition
    public String ADDRESS = "ADDRESS";
	
	@ElementDefinition
    public String DOB = "DOB";
	
	@ElementDefinition
    public String EMAIL = "EMAIL";
	
	@ElementDefinition
    public String AGREETOTERMS = "AGREETOTERMS";
	
	@ElementDefinition
    public String Continue = "Continue";
	
	@TimeMethod
	@ScreenShot
	public boolean setInformation();
}
