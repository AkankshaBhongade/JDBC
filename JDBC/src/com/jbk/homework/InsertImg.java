package com.jbk.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jbk.config.DbConnection;

public class InsertImg {
	//public static void main(String[] args) {
		
	 public static void  insertimage() {
	try {
		
		Connection connection=DbConnection.getConnection();
//		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int id= sc.nextInt();
		System.out.println("Enter name");
		String name= sc.next();
     System.out.println("Enter age");
		int age= sc.nextInt();
		System.out.println("Enter marks");
		int marks= sc.nextInt();
//		
	PreparedStatement preparedStatement	=connection.prepareStatement(" INSERT INTO students(Id, name,age ,marks,profilepic) values(?,?,?,?,?)");
//
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, "name");
	preparedStatement.setInt(3, age);
	preparedStatement.setInt(4, marks);
//	
	FileInputStream fs=new FileInputStream("D:\\Workspaces\\workspace oxygen\\JDBC\\images\\OIP.jfif ");
	preparedStatement.setBinaryStream(5, fs, fs.available());
	
	preparedStatement.executeUpdate();
		
		System.out.println("done");
//		
	} catch (Exception e) {
//		// TODO: handle exception
		e.printStackTrace();
	}

	}
}
