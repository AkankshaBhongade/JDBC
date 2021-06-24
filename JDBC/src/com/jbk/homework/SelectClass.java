package com.jbk.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.jbk.config.DbConnection;

public class SelectClass {

	public static void Select() {
		try {
			 Connection connection= DbConnection.getConnection();
			 PreparedStatement preparedStatement = connection.prepareStatement("select * from students ");
				
		ResultSet resultSet=	 preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("id")+"\t");
			System.out.print(resultSet.getString("name")+"\t");
			System.out.print(resultSet.getString("age")+"\t");
			System.out.println(resultSet.getInt("marks"));
		}
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}
