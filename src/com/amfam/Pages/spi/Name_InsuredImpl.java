package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;
import com.amfam.Pages.Name_Insured;
import com.amfam.utility.AmFamPage;

public class Name_InsuredImpl extends AmFamPage implements Name_Insured {

	private PageData pageData;
	public Name_InsuredImpl() {
		super();
		this.pageData = dataManager.getPageData("NameInsuredDetails");;
	}
	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Name_Insured) PageManager.instance().createPage( Name_Insured.class, getCustumWebDriver()); 
	}
	

	public boolean setNameInsured(){
		try{
			
			func.waitForClickable(this.getPageDataReference(),HAVEAUTOINS,50000,50000);	
			getElement(HAVEAUTOINS).click();
			getElement(COMPANY).setValue(pageData.getData("COMPANY"));
			getElement(DURATION).setValue(pageData.getData("DURATION"));
			getElement(ENDDATE).setValue(pageData.getData("ENDDATE"));
			getElement(LIMITS).setValue(pageData.getData("LIMITS"));
			getElement(NEXT_NI).click();		 
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
      	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
