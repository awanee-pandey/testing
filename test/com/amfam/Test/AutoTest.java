package com.amfam.Test;

import org.testng.annotations.Test;

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
import com.amfam.utility.AmFamBaseTest;
import com.amfam.utility.GenericFunctions;

public class AutoTest extends AmFamBaseTest{
	
	@Test( dataProvider = "deviceManager")
    public void testAutoAmFam(TestName testName) 
    {
		
        try{
        	
        	
        	Home_PageImpl impl = new Home_PageImpl();
     		Home_Page home_Page =  (Home_Page) impl.getPageDataReference(); 		
     		home_Page.startQuote(); 
     		
     		Information_PageImpl impl1= new Information_PageImpl();
     		Information_Page information_Page= (Information_Page) impl1.getPageDataReference();
     		information_Page.setInformation();
     		
     		Vehicles_PageImpl impl2= new Vehicles_PageImpl();
     		Vehicles_Page vehicles_Page= (Vehicles_Page) impl2.getPageDataReference();
     		vehicles_Page.setVehicle();
     		
     		Vehicles_DetailsImpl impl3= new Vehicles_DetailsImpl();
     		Vehicles_Details vehicles_Details= (Vehicles_Details) impl3.getPageDataReference();
     		vehicles_Details.setVehiclesDetails();
        	
     		Driver_Info_PageImpl impl4= new Driver_Info_PageImpl();
     		Driver_Info_Page driver_Info_Page= (Driver_Info_Page) impl4.getPageDataReference();
     		driver_Info_Page.setDriverInfo();
     		
     		Person_InformationImpl impl5= new Person_InformationImpl();
    		Person_Information person_Information= (Person_Information) impl5.getPageDataReference();
    		person_Information.setPersonInfo();
    		
    		Additional_InfoImpl impl6= new Additional_InfoImpl();
    		Additional_Info additional_Info= (Additional_Info) impl6.getPageDataReference();
    		additional_Info.setAdditionalInfo();
    		
    		Name_InsuredImpl impl7= new Name_InsuredImpl();
    		Name_Insured name_Insured= (Name_Insured) impl7.getPageDataReference();
    		name_Insured.setNameInsured();
    		
    		DiscountsImpl impl8= new DiscountsImpl();
    		Discounts discounts= (Discounts) impl8.getPageDataReference();
    		discounts.setDiscounts();	
    		
    		Choose_CoverageImpl impl9= new Choose_CoverageImpl();
    		Choose_Coverage choose_CoverageImpl= (Choose_Coverage) impl9.getPageDataReference();
    		choose_CoverageImpl.chooseCoverage();
    		
    		Coverage_SummaryImpl impl10= new Coverage_SummaryImpl();
    		Coverage_Summary coverage_Summary = (Coverage_Summary) impl10.getPageDataReference();
    		coverage_Summary.setCoverageSummary();
    		
    		PurchaseImpl impl11= new PurchaseImpl();
    		Purchase purchase = (Purchase) impl11.getPageDataReference();
    		purchase.setPurchase();
    		
    		VerifyImpl impl12= new VerifyImpl();
    		Verify verify = (Verify) impl12.getPageDataReference();
    		verify.verify();
    		
    		Vehicle_DetailsImpl impl13= new Vehicle_DetailsImpl();
    		Vehicle_Details vehicle_Details = (Vehicle_Details) impl13.getPageDataReference();
    		vehicle_Details.setVehicleDeatils();
    		
    		SummaryImpl impl14= new SummaryImpl();
    		Summary summary = (Summary) impl14.getPageDataReference();
    		summary.setSummary();
    		
    		SignImpl impl15= new SignImpl();
    		Sign sign = (Sign) impl15.getPageDataReference();
    		sign.setSign();
    		
    		Review_SignImpl impl17= new Review_SignImpl();
    		Review_Sign review_Sign = (Review_Sign) impl17.getPageDataReference();
    		review_Sign.setReviewSign();
    		
        }catch(Exception ex){
        	System.out.println(ex.toString());
        	ex.printStackTrace();
        }
    }

}
