package com.feb24;

import java.util.Scanner;

public class MenuDrivenApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management Application");
		Scanner s = new Scanner(System.in);
		
		int choice=0;
		
		do {
			System.out.println("1.Student information");
			System.out.println("2.Student Course Detail");
			System.out.println("3.Student Eligibility");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			choice=s.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter name: ");
				String name = s.next();
				System.out.println("Enter Student name: "+name);
				System.out.println("Enter age: ");
				int age = s.nextInt();
				System.out.println("Enter Student age: "+age);
				System.out.println("Enter Add: ");
				String add = s.next();
			break;
			case 2: 
				System.out.println("Enter Student Course rating: ");
				double rating= s.nextDouble();
				if(rating>=4)
				{
					System.out.println("Very Good");
				}
				else 
				{
					System.out.println("Need to improve");
				}
			break;
			case 3:
				System.out.println("Enter student attendance:  ");
				int attendance = s.nextInt();
				if(attendance>=50)
				{
					System.out.println("Eligible for Placement");
				}
				else
				{
					System.out.println("Not Eligible for Placement");
				}
				
			break;
			case 4:
				System.out.println("Thank you for rating us !byee ");
			break;
			default:
				System.out.println("Wrong choice!!!!");
			}
		}
		while(choice!=4);
	}
}

			
			
			
		

	


