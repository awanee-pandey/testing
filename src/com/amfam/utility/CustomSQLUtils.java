package com.amfam.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CustomSQLUtils {

 
    
    //
    // Implementation
    //
    /**
     * This method establishes the DB connection, executes the SQL statement and returns an array of Object
     * @param username
     * @param password
     * @param url
     * @param driver
     * @param query
     * @param params
     * @return object
     * @throws Exception
     */
	public static List<Object[][]> getResults(String username, String password, String url, String driver, String LOB,
			String testCase) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "Select * from tableinformation where LOB = '" + LOB
				+ "' order by CONVERT(sortnumber, UNSIGNED INTEGER) asc";
		
		//MS DB
		query = "Select * from tableinformation where LOB = '" + LOB	+ "'";
		
		List<Object[][]> listOfLists = new ArrayList<Object[][]>();
		try {
			conn = getConnection(username, password, url, driver);

			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();

			rs.next();

			do {
				String selectQuery = "Select * from " + rs.getString("TableName") + " where TestCase='" + testCase
						+ "' order by CONVERT(sortnumber, UNSIGNED INTEGER) asc";
				
				selectQuery = "Select * from " + rs.getString("TableName") + " where TestCase='" + testCase
						+ "' order by sortnumber asc";
				
				pstmt = conn.prepareStatement(selectQuery);
				ResultSet rsInner = pstmt.executeQuery();

				Object[][] dataSet = consume(rsInner);
				listOfLists.add(dataSet);
			} while (rs.next());

			return listOfLists;
		} finally {
			try {
				rs.close();
			} catch (Throwable e) {
			}

			try {
				pstmt.close();
			} catch (Throwable e) {
			}

			try {
				conn.close();
			} catch (Throwable e) {
			}
		}
	}

  

    /**
     * Gets the DB connection
     * @param username
     * @param password
     * @param url
     * @param driver
     * @return Connection
     * @throws Exception
     */
    private static Connection getConnection( String username,
                                             String password,
                                             String url,
                                             String driver )
        throws Exception
    {
        Connection conn = null;

        Class.forName( driver );

        conn = DriverManager.getConnection( url,
                                            username,
                                            password );

        return conn;
    }

    /**
     * This method converts the result set to a two dimensional array Object 
     * @param rs - ResultSet
     * @return Object[][]
     * @throws Exception
     */
    private static Object[][] consume( ResultSet rs )
        throws Exception
    {
        ResultSetMetaData rsmd = rs.getMetaData();
        LinkedList results = new LinkedList();
        int colCount = rsmd.getColumnCount();
        Object[] rowHeader = new Object[ colCount ];
        for( int iLoopCount = 1; iLoopCount <= colCount; ++iLoopCount )
        {
           
            rowHeader[ iLoopCount - 1 ] = rsmd.getTableName(iLoopCount)+"."+rsmd.getColumnName( iLoopCount );
        }
        results.add( rowHeader );
        while( rs.next() )
        {
            Object[] row = new Object[ colCount ];
       

            for( int iLoopCountInner = 1;iLoopCountInner <= colCount; ++iLoopCountInner )
            {
                row[ iLoopCountInner - 1 ] = rs.getObject( iLoopCountInner );
                
            }
       
            results.add( row );
        }

        return toOutArray( results, colCount );
    }

   
    private static Object[][] toOutArray( LinkedList listOfArray, int colCount )
    {
        int length = listOfArray.size();
        Object[][] rtn = new Object[ length ][colCount ];

        for( int iLoopCount = 0; iLoopCount < rtn.length; ++iLoopCount )
        {
            rtn[iLoopCount] = (Object[]) listOfArray.get( iLoopCount );
        }

        return rtn;
    }

  
}