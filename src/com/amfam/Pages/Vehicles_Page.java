package com.amfam.Pages;

import org.xframium.page.Page;
import org.xframium.page.Page.ScreenShot;
import org.xframium.page.Page.TimeMethod;

public interface Vehicles_Page extends Page {

	@ElementDefinition
    public String VIN = "VIN";	
	
	@ElementDefinition
    public String VINNUMBER = "VINNUMBER";	
	
	@ElementDefinition
    public String MODEL_YEAR_VIN = "MODEL_YEAR_VIN";
	
	@ElementDefinition
    public String ADDVEHICLEBYVIN = "ADDVEHICLEBYVIN";
	
	@ElementDefinition
    public String BUSINESSPURPOSENO = "BUSINESSPURPOSENO";
	
	@ElementDefinition
    public String BUSINESSPURPOSEYES = "BUSINESSPURPOSEYES";
	
	@ElementDefinition
    public String NEXT = "NEXT";
	
	@ElementDefinition
    public String MODEL_YEAR = "MODEL_YEAR";
	
	@ElementDefinition
    public String MAKE = "MAKE";
	
	@ElementDefinition
    public String MODEL = "MODEL";
	
	@ElementDefinition
    public String SERIES = "SERIES";
	
	@ElementDefinition
    public String ADDVEHICLE = "ADDVEHICLE";
	
	@ElementDefinition
    public String BUSINESSPURPOSE = "BUSINESSPURPOSE";
	
	@TimeMethod
	@ScreenShot
	public boolean setVehicle();
}
