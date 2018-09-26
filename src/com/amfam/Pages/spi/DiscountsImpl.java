package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import com.amfam.Pages.Discounts;
import com.amfam.utility.AmFamPage;

public class DiscountsImpl extends AmFamPage implements Discounts {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Discounts) PageManager.instance().createPage( Discounts.class, getCustumWebDriver()); 
	}

	public boolean setDiscounts() {
		// TODO Auto-generated method stub
		try{
			func.waitForClickable(this.getPageDataReference(),AUTOPAY,50000,50000);
			 getElement(AUTOPAY).click();
			 getElement(PAPERLESS).click();
			 getElement(NEXT_DISCOUNTS).click();		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
