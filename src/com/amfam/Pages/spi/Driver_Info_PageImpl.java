package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;

import com.amfam.Pages.Driver_Info_Page;
import com.amfam.utility.AmFamPage;

public class Driver_Info_PageImpl extends AmFamPage implements Driver_Info_Page {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Driver_Info_Page) PageManager.instance().createPage( Driver_Info_Page.class, getCustumWebDriver()); 
	}

	public boolean setDriverInfo(){
		try{
			func.waitForClickable(this.getPageDataReference(),NEXT_DRIVER,50000,50000);
			getElement(NEXT_DRIVER).click();		 
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
      	ex.printStackTrace();
			return false;
		}
		return true;
	}
	

}
