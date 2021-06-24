package com.jbk.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jbk.config.DbConnection;

public class Highest_mark {
	public static void HighMark() throws SQLException {
		try {
			Connection con=DbConnection.getConnection();
			
			PreparedStatement stmt= con.prepareStatement("Select * from students where marks=(select max(marks) from students");	
			ResultSet resultSet= stmt.executeQuery();

			while(resultSet.next()) {
				
			System.out.print( resultSet.getInt("id")+"\t");
			System.out.print( resultSet.getString("name")+"\t");
			System.out.print(resultSet.getInt("age")+"\t");
			System.out.println(resultSet.getInt("marks"));
			}
			} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}
	
		
		}
	
	
	}


