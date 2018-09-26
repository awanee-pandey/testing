package com.amfam.Pages;

import org.xframium.page.Page;

public interface Vehicle_Details extends Page {
	
	@ElementDefinition
    public String VIN = "VIN";	
	
	@ElementDefinition
    public String NEXT_VEHICLE = "NEXT_VEHICLE";
	
	@TimeMethod
	@ScreenShot
	public Boolean setVehicleDeatils();

}
