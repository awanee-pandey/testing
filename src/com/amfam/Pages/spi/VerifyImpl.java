package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;
import com.amfam.Pages.Verify;
import com.amfam.utility.AmFamPage;

public class VerifyImpl extends AmFamPage implements Verify {

private PageData pageData;
	
	public VerifyImpl() {
		super();
		this.pageData = dataManager.getPageData("VerifyDetails");;
	}

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Verify) PageManager.instance().createPage( Verify.class, getCustumWebDriver()); 
	}
	

	public boolean verify(){
		
		try{
			func.waitForClickable(this.getPageDataReference(),LICENSESTATE,50000,50000);
			 getElement(LICENSESTATE).setValue(pageData.getData("LICENSESTATE"));
			 getElement(LICENSENUMBER).setValue(pageData.getData("LICENSENUMBER"));
			 getElement(PHONE).setValue(pageData.getData("PHONE"));
			 getElement(NEXT_VERIFY).click();
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
       	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
