package com.amfam.Pages;

import org.xframium.page.Page;
import org.xframium.page.Page.ScreenShot;
import org.xframium.page.Page.TimeMethod;


public interface Discounts extends Page {

	@ElementDefinition
    public String AUTOPAY = "AUTOPAY";	
	
	@ElementDefinition
    public String PAPERLESS = "PAPERLESS";	
	
	@ElementDefinition
    public String NEXT_DISCOUNTS = "NEXT_DISCOUNTS";
	
	@TimeMethod
	@ScreenShot
	public boolean setDiscounts();
}
