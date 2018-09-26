package com.amfam.Pages;

import org.xframium.page.Page;
import org.xframium.page.Page.ScreenShot;
import org.xframium.page.Page.TimeMethod;

public interface Name_Insured extends Page{
	
	@ElementDefinition
    public String HAVEAUTOINS = "HAVEAUTOINS";	
	
	@ElementDefinition
    public String STATECODE = "STATECODE";	
	
	@ElementDefinition
    public String COMPANY = "COMPANY";
	
	@ElementDefinition
    public String DURATION = "DURATION";
	
	@ElementDefinition
    public String ENDDATE = "ENDDATE";
	
	@ElementDefinition
    public String LIMITS = "LIMITS";
	
	@ElementDefinition
    public String NEXT_NI = "NEXT_NI";

	@TimeMethod
	@ScreenShot
	public boolean setNameInsured();
}
