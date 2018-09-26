package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;


import com.amfam.Pages.Additional_Info;
import com.amfam.utility.AmFamPage;

public class Additional_InfoImpl extends AmFamPage implements Additional_Info{

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Additional_Info) PageManager.instance().createPage( Additional_Info.class, getCustumWebDriver()); 
	}
	

	public boolean setAdditionalInfo() {
		// TODO Auto-generated method stub
		try{
			func.waitForClickable(this.getPageDataReference(),NEXT_AI,50000,50000);
			 getElement(NEXT_AI).click();	
			 System.out.println("JKLM");
			System.out.println("JKLM");
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
        	ex.printStackTrace();
			return false;
		}
		return true;
	}


}
