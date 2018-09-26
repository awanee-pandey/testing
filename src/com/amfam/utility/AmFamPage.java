package com.amfam.utility;

import org.openqa.selenium.WebDriver;
import org.xframium.page.LocalAbstractPage;
import org.xframium.page.Page;
import org.xframium.page.data.PageDataManager;

public abstract class AmFamPage extends LocalAbstractPage{

	
	public static PageDataManager dataManager = PageDataManager.instance();	
	public static GenericFunctions func = new GenericFunctions();

	public abstract Page getPageDataReference();
	
	
	public void initializePage() {
		// TODO Auto-generated method stub
		dataManager = PageDataManager.instance();
	}
	
	public WebDriver getCustumWebDriver()
	{
		return func.getCustumWebDriver();
	}

}


