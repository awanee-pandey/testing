package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import com.amfam.Pages.Coverage_Summary;
import com.amfam.utility.AmFamPage;

public class Coverage_SummaryImpl extends AmFamPage implements Coverage_Summary {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Coverage_Summary) PageManager.instance().createPage( Coverage_Summary.class, getCustumWebDriver()); 
	}
	

	public boolean setCoverageSummary() {
		// TODO Auto-generated method stub
		try{
			func.waitForClickable(this.getPageDataReference(),BUYNOW,50000,50000);
			 getElement(BUYNOW).click();			
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}
}
