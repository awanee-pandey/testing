package com.amfam.Pages;

import org.xframium.page.Page;
public interface Vehicles_Details extends Page {
	
	@ElementDefinition
    public String USAGE = "USAGE";	
	
	@ElementDefinition
    public String MILESDRIVEN = "MILESDRIVEN";	
	
	@ElementDefinition
    public String NEXTBUTTON = "NEXTBUTTON";
	
	@TimeMethod
	@ScreenShot
	public boolean setVehiclesDetails();

}
