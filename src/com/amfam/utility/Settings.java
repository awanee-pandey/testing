package com.amfam.utility;

import java.io.File;
import java.util.logging.Level;

import org.openqa.jetty.html.Page;
import org.xframium.application.ApplicationRegistry;
import org.xframium.application.XMLApplicationProvider;
import org.xframium.artifact.ArtifactType;
import org.xframium.device.DeviceManager;
import org.xframium.device.cloud.CloudRegistry;
import org.xframium.device.cloud.XMLCloudProvider;
import org.xframium.device.data.DataManager;
import org.xframium.device.data.DataProvider;
import org.xframium.device.data.XMLDataProvider;
import org.xframium.device.data.DataProvider.DriverType;
import org.xframium.device.logging.ThreadedFileHandler;
import org.xframium.device.ng.AbstractSeleniumTest;
import org.xframium.gesture.GestureManager;
import org.xframium.gesture.factory.spi.PerfectoGestureFactory;
import org.xframium.page.PageManager;
import org.xframium.page.data.PageDataManager;
import org.xframium.page.element.provider.SQLElementProvider;
import org.xframium.page.listener.LoggingExecutionListener;
import org.xframium.spi.RunDetails;


public class Settings extends AbstractSeleniumTest {

	public Settings() {
		log.info("Setup started..");
		
		CloudRegistrySettings();
		ApplicationRegistrySettings();
		deviceRegistrySettings();
		ReportsAndGestureSettings();				
		LoadRepository();
		LoadData();

		log.info("Setup done..");
	}
	
	
	private void CloudRegistrySettings()
	{
		//=========================================================================================================
		CloudRegistry.instance().setCloudProvider( new XMLCloudProvider( "cloudRegistry.xml" ) );
		CloudRegistry.instance().setCloud( "local" );
        
	}
	
	private void ApplicationRegistrySettings()
	{
		 //=========================================================================================================
        // Application - Passing a configuration file name indicates it is in the class path - passing a File object indicates the file system
        //
        ApplicationRegistry.instance().setApplicationProvider( new XMLApplicationProvider( "applicationRegistry.xml" ) );
        ApplicationRegistry.instance().setAUT( "AmFAM" );
        //=========================================================================================================
	}

	
	private void deviceRegistrySettings()
	{
		 //=========================================================================================================
		
        DataProvider dataProvider = new XMLDataProvider( "deviceRegistry.xml", DriverType.WEB );
        DataManager.instance().readData( dataProvider );
        //=========================================================================================================
	}
	
	
	private void ReportsAndGestureSettings()
	{
		 //
        // The factory for generating devices Gestures
        //
        GestureManager.instance().setGestureFactory( new PerfectoGestureFactory() );      
        DataManager.instance().setReportFolder( new File( "test-output" ) );
        PageManager.instance().setStoreImages(true);
        PageManager.instance().setImageLocation("test-output");
        DataManager.instance().setAutomaticDownloads( new ArtifactType[] { ArtifactType.EXECUTION_REPORT_HTML, 
        		ArtifactType.FAILURE_SOURCE, ArtifactType.CONSOLE_LOG, ArtifactType.WCAG_REPORT, ArtifactType.EXECUTION_VIDEO,
        		ArtifactType.EXECUTION_RECORD_CSV, ArtifactType.EXECUTION_RECORD_HTML} );
        
       
        ThreadedFileHandler threadedHandler = new ThreadedFileHandler();
        threadedHandler.configureHandler( Level.ALL);
       
        //
        // The RunDetail singleton can be registered to track all runs for the consolidated output report
        DeviceManager.instance().addRunListener( RunDetails.instance() );
        
	}

	
	private void LoadRepository() {

		//XML ObjectRepository
		//PageManager.instance().setElementProvider(new XMLElementProvider(("pageElements.xml")));
		
		//SQL ObjectRepository
		String driverClassName = "net.ucanaccess.jdbc.UcanaccessDriver";
		String url = "jdbc:ucanaccess://C://software//Selenium//TestDatabase.accdb";
		PageManager.instance().setSiteName("AmFAM");
		PageManager.instance().registerExecutionListener(new LoggingExecutionListener());
		PageManager.instance().setElementProvider(new SQLElementProvider("", "", url, driverClassName));

	}
	
	
	private void LoadData() {
		String driverClassName = "net.ucanaccess.jdbc.UcanaccessDriver";
		String url = "jdbc:ucanaccess://C://software//Selenium//TestDatabase.accdb";
		PageManager.instance().setSiteName("AmFAM");
		PageManager.instance().registerExecutionListener(new LoggingExecutionListener());

		PageDataManager.instance().setPageDataProvider(
				new SQLCustomDataprovider("", "", url, driverClassName, "AUTO", "TC1"));
		
	}
}
