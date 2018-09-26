package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;
import com.amfam.Pages.Vehicles_Details;
import com.amfam.utility.AmFamPage;

public class Vehicles_DetailsImpl extends AmFamPage implements Vehicles_Details {

	private PageData pageData;
	public Vehicles_DetailsImpl() {
		super();
		this.pageData = dataManager.getPageData("VehicleDetails");;
	}

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Vehicles_Details) PageManager.instance().createPage( Vehicles_Details.class, getCustumWebDriver()); 
	}

	public boolean setVehiclesDetails(){
		try{
			
			func.waitForClickable(this.getPageDataReference(),USAGE,50000,50000);
			getElement(USAGE).setValue(pageData.getData("USAGE"));
			getElement(MILESDRIVEN).setValue(pageData.getData("MILESDRIVEN"));
			getElement(NEXTBUTTON).click();		 
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
      	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
