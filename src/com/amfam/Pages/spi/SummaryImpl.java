package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import com.amfam.Pages.Summary;
import com.amfam.utility.AmFamPage;

public class SummaryImpl extends AmFamPage implements Summary {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Summary) PageManager.instance().createPage( Summary.class, getCustumWebDriver()); 
	}

	public boolean setSummary() {
		// TODO Auto-generated method stub
		try{
			func.waitForClickable(this.getPageDataReference(),NEXT_SUMMARY,50000,50000);		
			 getElement(NEXT_SUMMARY).click();		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
