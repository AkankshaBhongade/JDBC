//package com.jbk.config;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//
//public class DbConnection {
//	
//	public static Connection connection=null;
//	public static Connection getConnection()
//			//public static Connection get
//			{
//				try {
//					//make connection 
//					Class.forName("com.mysql.jdbc.Driver"); 
//					
//					//load Driver
//Connection connection=	 DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");
//					
//					
//				} catch (Exception e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//				return connection;
//	
//	}
//
//}



package com.jbk.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	private static Connection connection = null;

	public static Connection getConnection() {

		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");

			// create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}

}
