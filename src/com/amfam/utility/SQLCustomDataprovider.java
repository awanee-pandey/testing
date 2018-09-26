package com.amfam.utility;

import java.util.List;
import org.xframium.page.data.DefaultPageData;
import org.xframium.page.data.provider.SQLPageDataProvider;

public class SQLCustomDataprovider extends SQLPageDataProvider {
	
		/** The username. */
	    private String username;
		
	    /** The password. */
	    private String password;
		
	    /** The JDBC URL. */
	    private String url;
		
	    /** The driver class name. */
	    private String driver;
		
	    /** The query. */
	    private String query;
	    
	    private String testCase;
	
	public SQLCustomDataprovider(String username, String password, String url, String driver, String query, String testCase) {		
		super(username, password, url, driver, query);
		this.username = username;
        this.password = password;
        this.url = url;
        this.driver = driver;
        this.query= query;
        this.testCase=testCase;
		// TODO Auto-generated constructor stub
	}
	
	 @Override
     public void readPageData() {
            try {
                   List<Object[][]> dataMaster = CustomSQLUtils.getResults(username, password, url, driver, query, testCase);

                   for (int recordCount = 0; recordCount < dataMaster.size(); recordCount++) {
                         Object[][] data = dataMaster.get(recordCount);
                         String[] str_array = ((String) (data[0][0])).split("\\.");
                         String tableName = str_array[0];
                         addRecordType(tableName, false);
                         for (int iLoopCount = 1; iLoopCount < data.length; iLoopCount++) {
 
                         //test12323
                        	 DefaultPageData currentRecord = new DefaultPageData(tableName, tableName + "-" + iLoopCount, true);

                                for (int iLoopInnerCount = 0; iLoopInnerCount < data[iLoopCount].length; iLoopInnerCount++) {
                                	
                                	   String [] columnnames= ((String) data[0][iLoopInnerCount]).split("\\.");
                                       String currentName = columnnames[1];
                                       String currentValue = (String) data[iLoopCount][iLoopInnerCount];

                                       //
                                       // This is a reference to another page data table
                                     
                                       currentRecord.addPageData(currentName);
                                       currentRecord.addValue(currentName, currentValue);
                                       currentRecord.setContainsChildren(true);

                                }

                                addRecord(currentRecord);

                         }

                   }

            } catch (Exception e) {
                   log.fatal("Error reading Excel Element File", e);
            }
     }

}
