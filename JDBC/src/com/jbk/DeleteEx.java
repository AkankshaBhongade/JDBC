package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jbk.config.DbConnection;


public class DeleteEx {
	public static void delete() {
//		Class.forName("com.mysql.jdbc.Driver"); //this path taken from jar file
//		
//		//load Driver
//Connection connection=	 DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");

	Connection connection=	DbConnection.getConnection();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Id For Delete Student");
	int id=scanner.nextInt();
	
 boolean b=	SelectById.selectById(id);
	
 if(b==true) {
	 try {
			PreparedStatement preparedStatement=	connection.prepareStatement("DELETE FROM students WHERE id=?");
			preparedStatement.setInt(1, id);
			
		int deletedRows=	preparedStatement.executeUpdate();

		if(deletedRows>0) {
			System.out.println("Student Deleted Successfully!!!");
		}
		else {
			System.out.println("Studen Not Deleted");
		}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
				
 }
 else {
	 System.out.println("Student Not Found");
 }
	
	
		
	}
	

}
