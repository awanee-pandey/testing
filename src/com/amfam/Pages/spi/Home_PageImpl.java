package com.amfam.Pages.spi;

import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;

import com.amfam.Pages.Home_Page;
import com.amfam.utility.AmFamPage;

public class Home_PageImpl extends AmFamPage implements Home_Page{

	private PageData pageData;
	
	public Home_PageImpl() {
		super();
		this.pageData = dataManager.getPageData("QuoteDetails");;
	}

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Home_Page) PageManager.instance().createPage( Home_Page.class, getCustumWebDriver()); 
	}
	
	public boolean startQuote(){
		
		try{
			func.waitForClickable(this.getPageDataReference(),ZIP,50000,50000);
			 getElement(ZIP).setValue(pageData.getData("ZIP"));;
			 getElement(START_QUOTING_BUTTON).click();
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
       	ex.printStackTrace();
			return false;
		}
		return true;
	}

}
