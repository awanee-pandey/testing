package com.amfam.utility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.xframium.device.ng.AbstractSeleniumTest;

import com.amfam.Pages.Additional_Info;
import com.amfam.Pages.Choose_Coverage;
import com.amfam.Pages.Coverage_Summary;
import com.amfam.Pages.Discounts;
import com.amfam.Pages.Driver_Info_Page;
import com.amfam.Pages.Home_Page;
import com.amfam.Pages.Information_Page;
import com.amfam.Pages.Name_Insured;
import com.amfam.Pages.Person_Information;
import com.amfam.Pages.Purchase;
import com.amfam.Pages.Review_Sign;
import com.amfam.Pages.Sign;
import com.amfam.Pages.Summary;
import com.amfam.Pages.Vehicle_Details;
import com.amfam.Pages.Vehicles_Details;
import com.amfam.Pages.Vehicles_Page;
import com.amfam.Pages.Verify;
import com.amfam.Pages.spi.Additional_InfoImpl;
import com.amfam.Pages.spi.Choose_CoverageImpl;
import com.amfam.Pages.spi.Coverage_SummaryImpl;
import com.amfam.Pages.spi.DiscountsImpl;
import com.amfam.Pages.spi.Driver_Info_PageImpl;
import com.amfam.Pages.spi.Home_PageImpl;
import com.amfam.Pages.spi.Information_PageImpl;
import com.amfam.Pages.spi.Name_InsuredImpl;
import com.amfam.Pages.spi.Person_InformationImpl;
import com.amfam.Pages.spi.PurchaseImpl;
import com.amfam.Pages.spi.Review_SignImpl;
import com.amfam.Pages.spi.SignImpl;
import com.amfam.Pages.spi.SummaryImpl;
import com.amfam.Pages.spi.Vehicle_DetailsImpl;
import com.amfam.Pages.spi.Vehicles_DetailsImpl;
import com.amfam.Pages.spi.Vehicles_PageImpl;
import com.amfam.Pages.spi.VerifyImpl;

public class AmFamBaseTest extends AbstractSeleniumTest {
	
	@BeforeSuite
    public void setupSuite()
    {
 		new Settings();  
   }

 	@AfterSuite
 	public void cleanupSuite()
 	{
 		new Cleanup();  
 	}

 	protected void startQuote()
 	{
 		Home_PageImpl impl = new Home_PageImpl();
 		Home_Page home_Page =  (Home_Page) impl.getPageDataReference(); 		
 		home_Page.startQuote();    	
 	}
 	
 	
 	protected void setInformation()
 	{
 		Information_PageImpl impl= new Information_PageImpl();
 		Information_Page information_Page= (Information_Page) impl.getPageDataReference();
 		information_Page.setInformation();
 	}
 	
 	protected void setVehiclesInfo()
 	{
 		Vehicles_PageImpl impl= new Vehicles_PageImpl();
 		Vehicles_Page vehicles_Page= (Vehicles_Page) impl.getPageDataReference();
 		vehicles_Page.setVehicle();
 	}
 	
 	protected void setVehiclesDetails()
 	{
 		Vehicles_DetailsImpl impl= new Vehicles_DetailsImpl();
 		Vehicles_Details vehicles_Details= (Vehicles_Details) impl.getPageDataReference();
 		vehicles_Details.setVehiclesDetails();
 	}
 	
 	protected void setDriverInfo()
 	{
 		Driver_Info_PageImpl impl= new Driver_Info_PageImpl();
 		Driver_Info_Page driver_Info_Page= (Driver_Info_Page) impl.getPageDataReference();
 		driver_Info_Page.setDriverInfo();
 	}
 	
	protected void setPersonInfo()
 	{
		Person_InformationImpl impl= new Person_InformationImpl();
		Person_Information person_Information= (Person_Information) impl.getPageDataReference();
		person_Information.setPersonInfo();
 	}
	
	protected void setAdditionalInfo()
	{
		Additional_InfoImpl impl= new Additional_InfoImpl();
		Additional_Info additional_Info= (Additional_Info) impl.getPageDataReference();
		additional_Info.setAdditionalInfo();
	}
	
	protected void setNameInsured()
	{
		Name_InsuredImpl impl= new Name_InsuredImpl();
		Name_Insured name_Insured= (Name_Insured) impl.getPageDataReference();
		name_Insured.setNameInsured();
	}

	protected void setDiscounts()
	{
		DiscountsImpl impl= new DiscountsImpl();
		Discounts discounts= (Discounts) impl.getPageDataReference();
		discounts.setDiscounts();
	}
	
	protected void chooseCoverage()
	{
		Choose_CoverageImpl impl= new Choose_CoverageImpl();
		Choose_Coverage choose_CoverageImpl= (Choose_Coverage) impl.getPageDataReference();
		choose_CoverageImpl.chooseCoverage();
	}
	
	protected void setCoverageSummary()
	{
		Coverage_SummaryImpl impl= new Coverage_SummaryImpl();
		Coverage_Summary coverage_Summary = (Coverage_Summary) impl.getPageDataReference();
		coverage_Summary.setCoverageSummary();
	}
	
	protected void setPurchase()
	{
		PurchaseImpl impl= new PurchaseImpl();
		Purchase purchase = (Purchase) impl.getPageDataReference();
		purchase.setPurchase();
	}
	
	protected void verify()
	{
		VerifyImpl impl= new VerifyImpl();
		Verify verify = (Verify) impl.getPageDataReference();
		verify.verify();
	}
	
	protected void setVehicleDeatils()
	{
		Vehicle_DetailsImpl impl= new Vehicle_DetailsImpl();
		Vehicle_Details vehicle_Details = (Vehicle_Details) impl.getPageDataReference();
		vehicle_Details.setVehicleDeatils();
	}
	
	protected void setSummary()
	{
		SummaryImpl impl= new SummaryImpl();
		Summary summary = (Summary) impl.getPageDataReference();
		summary.setSummary();
	}
	
	protected void setSign()
	{
		SignImpl impl= new SignImpl();
		Sign sign = (Sign) impl.getPageDataReference();
		sign.setSign();
	}
	
	protected void setReviewSign()
	{
		Review_SignImpl impl= new Review_SignImpl();
		Review_Sign review_Sign = (Review_Sign) impl.getPageDataReference();
		review_Sign.setReviewSign();
	}
}



