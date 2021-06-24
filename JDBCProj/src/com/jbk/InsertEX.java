package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.jbk.config.DbConnection;

public class InsertEX {
	

	public static void insert() {
		try {
			//make connection 
			Class.forName("com.mysql.jdbc.Driver"); //this path taken from jar file
	
			
			//load Driver
	Connection connection=	 DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");
			
		//	Connection connection=	DbConnection.getconnection();
			
	//enter data by using scanner
	Scanner scanner=new Scanner(System.in);

	System.out.println("Enter Id");
	int id=scanner.nextInt();
	System.out.println("Enter Name");
	String name=scanner.next();
	System.out.println("Enter Age");
	int age=scanner.nextInt();
	System.out.println("Enter Marks");
	int marks=scanner.nextInt();
	
	//prepare or write query which taken from user
	PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students(id,name,age,marks) values(?,?,?,?)");
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setInt(3, age);
	preparedStatement.setInt(4, marks);
	
	
	
	//select query
//PreparedStatement preparedStatement=	connection.prepareStatement("insert into students(id,name,age,) values(?,?,?,?)");
//	preparedStatement.setInt(1, 103);
//	preparedStatement.setString(2, "xyz");
//	preparedStatement.setInt(3, 45);
//	preparedStatement.setInt(4, 78);
	
//execute query
    int result=  preparedStatement.executeUpdate();
    System.out.println(result);
    
    //iterate it
    
    if(result>0) {
    	System.out.println("inserted");
    }else
    {
    	System.out.println("not inserted");
    }
   
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


}
