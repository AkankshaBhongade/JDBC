package com.jbk.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jbk.config.DbConnection;

public class Below_70marks {
	
		public static void below_70() {
			try {
				//load driver
			Connection connection =DbConnection.getConnection();
			//Scanner Scan =new Scanner(System.in);
			//prepared statement
			PreparedStatement preparedStatement=connection.prepareStatement("select * from students where marks<70 ");
			ResultSet result=	preparedStatement.executeQuery();
			 
			//itterate query
			while(result.next()) {
				System.out.print(result.getInt("id")+"\t");
				System.out.print(result.getString("name")+"\t");
				System.out.print(result.getInt("age")+"\t");
				System.out.println(result.getInt("marks"));
				
			}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
		
	}
}
