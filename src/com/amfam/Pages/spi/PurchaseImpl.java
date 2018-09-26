package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import com.amfam.Pages.Purchase;
import com.amfam.utility.AmFamPage;

public class PurchaseImpl extends AmFamPage implements Purchase {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Purchase) PageManager.instance().createPage( Purchase.class, getCustumWebDriver()); 
	}

	public boolean setPurchase() {
		// TODO Auto-generated method stub
		try{							
			func.waitForClickable(this.getPageDataReference(),Continue,50000,50000);	
			getElement(Continue).click();			
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
