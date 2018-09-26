package com.amfam.utility;

import java.awt.Desktop;
import java.io.File;
import org.xframium.artifact.ArtifactType;
import org.xframium.device.cloud.CloudRegistry;
import org.xframium.device.data.DataManager;
import org.xframium.device.ng.AbstractSeleniumTest;
import org.xframium.spi.RunDetails;

public class Cleanup  extends AbstractSeleniumTest{
	
	
	public Cleanup(){
 		
		 try
        {
           
            if( DataManager.instance().isArtifactEnabled( ArtifactType.EXECUTION_RECORD_HTML ) )
            {
            	RunDetails.instance().writeHTMLIndex( DataManager.instance().getReportFolder(), true );
            	
                File htmlFile = RunDetails.instance().getIndex( DataManager.instance().getReportFolder() );
                try
                {
                    Desktop.getDesktop().browse( htmlFile.toURI() );
                }
                catch( Exception e )
                {
                    e.printStackTrace();
                }
            }
            
           
        }
        catch( Exception e )
        {
            log.fatal( "Error executing Tests", e );
        }
        finally
        {
            CloudRegistry.instance().shutdown();
        }
        
		
	}

}
