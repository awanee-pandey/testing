package com.amfam.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xframium.device.ng.AbstractSeleniumTest;
import org.xframium.page.Page;
import org.xframium.page.element.Element;
import org.xframium.utility.html.HTMLElementLookup;

public class GenericFunctions extends AbstractSeleniumTest {
	public WebDriver getCustumWebDriver()
	{
		return getWebDriver();
		
	}
	
	public void waitForClickable(Page page, String objReposElement, long timeOutInSeconds, long sleepInMillis)	
	{
		new WebDriverWait(getWebDriver(), timeOutInSeconds, sleepInMillis)
		.until(ExpectedConditions.elementToBeClickable( getWebElement(page, objReposElement) ));
		
	}
	
	public void setImplicitWait(long seconds)	{
		getWebDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public void waitforTitleImplicitWait(String title)	{
		new WebDriverWait(getWebDriver(), 10, 100)
		.until(ExpectedConditions.titleContains(title));
	}
	
	
	public  WebElement getWebElement(Page page, String objReposElement)	{
		Element l = (Element) page.getElement( objReposElement );
		return getWebDriver().findElement(_useBy(l));
	}
	
	private static By _useBy(Element frameworkElement)
	{
		if (frameworkElement != null)	{
		String key = frameworkElement.getKey();
		switch (frameworkElement.getBy())
		{	case CLASS:
				return By.className( key );
			case CSS:
				return By.cssSelector( key );
			case ID:
				return By.id( key );
			case LINK_TEXT:
				return By.linkText( key );
			case NAME:
				return By.name( key );
			case TAG_NAME:
				return By.tagName( key );
			case XPATH:
				return By.xpath( key );
			case V_TEXT:
				return By.linkText( key );
			case HTML:
			    HTMLElementLookup elementLookup = new HTMLElementLookup( key );
			    return By.xpath( elementLookup.toXPath() );
			
			default:
					return null;	}
		}
		else	{ 
					return null;	}
			
	}
}
