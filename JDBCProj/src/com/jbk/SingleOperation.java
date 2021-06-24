package com.jbk;

import java.util.Scanner;

public class SingleOperation {
   public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	int choice;
	char ch;
	do {
		System.out.println("1.select");
		System.out.println("2.insert");
		System.out.println("3.delete");
		System.out.println("4.Select by id");
		System.out.println("5.Update");
		
		System.out.println("enter yout choice");
		choice= scanner.nextInt();
		
		switch (choice) {
		
            case 1:{
			SelectEX.select();
			break;
			}
            
        case 2:{
	          InsertEX.insert();
     	break;
        }
        case 3:{
			DeleteEx.delete();
			break;
        }
				case 4:{
			
			System.out.println("enter the id to find");
			int id =scanner.nextInt();
		boolean b=	SelectById.selectById(id);
			break;
			}
			 case 5:{
			         UpdateEx.Update();
		     	break;
		        }
            
		default:{
			System.out.println("invali option");
			break;
		}
		}
		System.out.println("do u want to continue press n/y");
		ch=scanner.next().charAt(0);
	} while (ch !='n');
	System.out.println("prog terminate");
}
	
}
