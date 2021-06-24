package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jbk.config.DbConnection;


public class SelectEX {
	public static void select() {
		try {
			//make connection 
//			Class.forName("com.mysql.jdbc.Driver"); //this path taken from jar file
//			
//			//load Driver
//	Connection connection=	 DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");
//	
	Connection connection=	DbConnection.getConnection();
	
	//select query
PreparedStatement preparedStatement=	connection.prepareStatement("SELECT * FROM students");
	
//execute query
    ResultSet resultSet=  preparedStatement.executeQuery();
    
    //iterate it
    while(resultSet.next()) {
    	System.out.print(resultSet.getInt("id")+"\t");
    	System.out.print(resultSet.getString("name")+"\t");
    	System.out.print(resultSet.getInt("age")+"\t");
    	System.out.println(resultSet.getInt("marks"));
    }
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
