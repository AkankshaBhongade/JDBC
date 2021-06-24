package com.jbk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.jbk.config.DbConnection;

public class UpdateEx {
   
	public static void Update() {
          
           Scanner scanner=new Scanner(System.in);
           System.out.println("enter id which u want update student");
           int id =scanner.nextInt();
           
           boolean b=SelectById.selectById(id);
        
           if(b==true) {
        try {
        
	  
	 System.out.println("enter name to update");
	 String name =scanner.next();
	 System.out.println("enter a age ");
	 int age =scanner.nextInt();
	 System.out.println("enter marks");
	 int marks=scanner.nextInt();
	 
		Connection connection=	DbConnection.getConnection();
		
	 PreparedStatement preparedStatement=connection.prepareStatement("update students set name=?, age=?, marks=? where id=?");
	
	 preparedStatement.setString(1, name);
	 preparedStatement.setInt(2, age);
	 preparedStatement.setInt(3, marks);
	 preparedStatement.setInt(4, id);
	 
	 int result= preparedStatement.executeUpdate();
	 if(result>0) {
		 System.out.println("updated ");
		 SelectEX.select();
	 }
	 else
	 {
		 System.out.println(" not update");
	 }
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
           }
           else {
        	   System.out.println("not fount for update");
           }
           
           }

	

}
