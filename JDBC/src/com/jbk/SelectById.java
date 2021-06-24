package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jbk.config.DbConnection;

public class SelectById {
	public static boolean selectById(int id) {
//		Class.forName("com.mysql.jdbc.Driver"); //this path taken from jar file
//		
//		//load Driver
//Connection connection=	 DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");

		Connection connection = DbConnection.getConnection();
		boolean b = false;
		try {
			PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM students WHERE id=?");
			 preparedStatement.setInt(1, id);
			 
			ResultSet  resultSet= preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				System.out.print(resultSet.getInt("id")+"\t");
				System.out.print(resultSet.getString("name")+"\t");
				System.out.print(resultSet.getInt("age")+"\t");
				System.out.println(resultSet.getString("marks"));
				b=true;
			}
			else {
				b=false;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;

	}

}
