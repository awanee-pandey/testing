package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import com.amfam.Pages.Vehicle_Details;

import com.amfam.utility.AmFamPage;

public class Vehicle_DetailsImpl extends AmFamPage implements Vehicle_Details {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Vehicle_Details) PageManager.instance().createPage( Vehicle_Details.class, getCustumWebDriver()); 
	}
	

	public Boolean setVehicleDeatils() {
		// TODO Auto-generated method stub
		try{							
			func.waitForClickable(this.getPageDataReference(),NEXT_VEHICLE,50000,50000);
			getElement(NEXT_VEHICLE).click();		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
