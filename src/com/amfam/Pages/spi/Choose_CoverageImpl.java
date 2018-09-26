package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;

import com.amfam.Pages.Choose_Coverage;
import com.amfam.utility.AmFamPage;

public class Choose_CoverageImpl extends AmFamPage implements Choose_Coverage {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Choose_Coverage) PageManager.instance().createPage( Choose_Coverage.class, getCustumWebDriver()); 
	}

	public boolean chooseCoverage() {
		// TODO Auto-generated method stub
		try{
			func.waitForClickable(this.getPageDataReference(),NEXT_COV,50000,50000);
			 getElement(NEXT_COV).click();			
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
