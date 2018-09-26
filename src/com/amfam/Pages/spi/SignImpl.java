package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import com.amfam.Pages.Sign;
import com.amfam.utility.AmFamPage;

public class SignImpl extends AmFamPage implements Sign {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Sign) PageManager.instance().createPage( Sign.class, getCustumWebDriver()); 
	}
	
	public boolean setSign() {
		// TODO Auto-generated method stub
		try{							
			func.waitForClickable(this.getPageDataReference(),REVIEW,50000,50000);	 
			getElement(REVIEW).click();			
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
