package com.jbk.homework;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jbk.config.DbConnection;

public class CommanCode {
	public static void main(String[] args) throws SQLException {
	
	Scanner scan =new Scanner(System.in);
	int choice;
	char ch = 0;
	do {
		System.out.println("1.select");
		System.out.println("2.ascending");
		System.out.println("3.HighMarks");
		System.out.println("4.image");
		System.out.println("5.below70");
		
		System.out.println("enter your choice");
		choice =scan.nextInt();
		switch (choice) {
		case 1:
		{
			SelectClass.Select();
		    break;
		}
		case 2:
		{
			asending_order.asending();
		    break;
		}
		case 3:
		{
			Highest_mark.HighMark();
			 break;
		}
		case 4:
		{
			InsertImg.insertimage();
			 break;
		}
		case 5:
		{
			Below_70marks.below_70();
			 break;
		}
		default:{
			break;
		}
		}
		
	} while (ch !='n');
		
	}

}
