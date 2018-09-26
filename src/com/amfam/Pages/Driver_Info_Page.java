package com.amfam.Pages;

import org.xframium.page.Page;

public interface Driver_Info_Page extends Page {
	
	@ElementDefinition
    public String NEXT_DRIVER = "NEXT_DRIVER";
	
	@TimeMethod
	@ScreenShot
	public boolean setDriverInfo();
	

}
