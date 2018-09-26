package com.amfam.Pages.spi;


import java.util.concurrent.TimeUnit;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;
import com.amfam.Pages.Vehicles_Page;
import com.amfam.utility.AmFamPage;
import com.amfam.utility.GenericFunctions;

public class Vehicles_PageImpl extends AmFamPage implements Vehicles_Page {
private PageData pageData;
private Page page;
public static GenericFunctions  func= new GenericFunctions();
	
	public Vehicles_PageImpl() {
		super();
		page= (Vehicles_Page) PageManager.instance().createPage( Vehicles_Page.class, getCustumWebDriver()); 
		this.pageData = dataManager.getPageData("Vehicle");;
		
	}

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		
		return (Vehicles_Page) PageManager.instance().createPage( Vehicles_Page.class, getCustumWebDriver()); 
	}
	
	public boolean setVehicle(){
		try{
			func.waitForClickable(this.getPageDataReference(),VIN,50000,50000);
			getElement(VIN).click();
			getElement(VINNUMBER).setValue(pageData.getData("VINNUMBER"));
			func.waitForClickable(page, MODEL_YEAR_VIN, 10, 100);
			getElement(MODEL_YEAR_VIN).setValue(pageData.getData("MODEL_YEAR_VIN"));
			
			func.waitForClickable(page, ADDVEHICLEBYVIN, 10, 100);
			getElement(ADDVEHICLEBYVIN).click();
			
			getCustumWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			func.waitForClickable(page, BUSINESSPURPOSENO, 10, 100);
			getElement(BUSINESSPURPOSENO).click();
			
			func.waitForClickable(page, NEXT, 10, 100);
			getElement(NEXT).click();		 
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
      	ex.printStackTrace();
			return false;
		}
		return true;
	}


}
