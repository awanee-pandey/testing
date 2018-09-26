package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;

import com.amfam.Pages.Person_Information;
import com.amfam.utility.AmFamPage;

public class Person_InformationImpl extends AmFamPage implements Person_Information {

	private PageData pageData;
	public Person_InformationImpl() {
		super();
		this.pageData = dataManager.getPageData("PersonDetails");;
	}
	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Person_Information) PageManager.instance().createPage( Person_Information.class, getCustumWebDriver()); 
	}

	public boolean setPersonInfo(){
		try{
			
			func.waitForClickable(this.getPageDataReference(),GENDER,50000,50000);	
			getElement(GENDER).setValue(pageData.getData("GENDER"));
			getElement(MARITALSTATUS).setValue(pageData.getData("MARITALSTATUS"));
			getElement(EMPLOYMENT).setValue(pageData.getData("EMPLOYMENT"));
			getElement(NEXT_PI).click();		 
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
      	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
