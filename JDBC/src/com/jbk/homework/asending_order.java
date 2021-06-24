package com.jbk.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.jbk.config.DbConnection;

public class asending_order {
	public static void asending() {
		try {
			//load driver
		Connection connection =DbConnection.getConnection();
		//Scanner Scan =new Scanner(System.in);
		//prepared statement
		PreparedStatement preparedStatement=connection.prepareStatement("select * from students order by marks asc ");
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
