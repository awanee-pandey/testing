package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;

import com.amfam.Pages.Review_Sign;
import com.amfam.utility.AmFamPage;

public class Review_SignImpl extends AmFamPage implements Review_Sign {

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Review_Sign) PageManager.instance().createPage( Review_Sign.class, getCustumWebDriver()); 
	}
	
	public boolean setReviewSign() {
		// TODO Auto-generated method stub
		try{							
			func.waitForClickable(this.getPageDataReference(),REVIEWDOCUMENTS,50000,50000);	 
			getElement(REVIEWDOCUMENTS).click();
			 getElement(SIGN1).click();
			 getElement(SIGNATURESUBMIT1).click();
			 getElement(SIGN2).click();
			 getElement(SIGNATURESUBMIT2).click();
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
