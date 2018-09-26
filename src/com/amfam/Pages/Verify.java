package com.amfam.Pages;

import org.xframium.page.Page;

public interface Verify extends Page {

	@ElementDefinition
    public String LICENSESTATE = "LICENSESTATE";	
	
	@ElementDefinition
    public String LICENSENUMBER = "LICENSENUMBER";	
	
	@ElementDefinition
    public String PHONE = "PHONE";
	
	@ElementDefinition
    public String NEXT_VERIFY = "NEXT_VERIFY";
	
	@TimeMethod
	@ScreenShot
	public boolean verify();
}
