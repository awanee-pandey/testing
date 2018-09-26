package com.amfam.Pages.spi;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.xframium.page.Page;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageData;
import org.xframium.page.keyWord.step.spi.KWSExecJS;

import com.amfam.Pages.Information_Page;
import com.amfam.utility.AmFamPage;

public class Information_PageImpl extends AmFamPage implements Information_Page {

	private PageData pageData;
	
	public Information_PageImpl() {
		super();
		this.pageData = dataManager.getPageData("InsuredDetails");;
	}

	@Override
	public Page getPageDataReference() {
		// TODO Auto-generated method stub
		return (Information_Page) PageManager.instance().createPage( Information_Page.class, getCustumWebDriver()); 
	}
	

	public boolean setInformation(){
		try{
			
			func.waitForClickable(this.getPageDataReference(),FIRSTNAME,50000,50000);	
			 getElement(FIRSTNAME).setValue(pageData.getData("FIRSTNAME"));
			 getElement(LASTNAME).setValue(pageData.getData("lastname"));
			 getElement(ADDRESS).setValue(pageData.getData("ADDRESS"));
			 getElement(DOB).setValue(pageData.getData("dob"));
			 getElement(EMAIL).setValue(pageData.getData("EMAIL"));
			 getElement(AGREETOTERMS).click();		
			 
			
		
				
		}
		catch(Exception ex){
			System.out.println(ex.toString());
      	ex.printStackTrace();
			return false;
		}
		return true;
	}


	
	public WebElement findElement(){
		JavascriptExecutor js = (JavascriptExecutor) getCustumWebDriver();
		 WebElement elm= findElement();			 
		 js.executeScript("arguments[0].click();", elm);
		return getCustumWebDriver().findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary btn-sm']"));
	}

}
