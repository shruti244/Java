package com.String;

import java.util.Scanner;

public class BasicStringProgram {

	public static void main(String[] args) {
		String name = "Shruti";
		System.out.println(name);
		//By object
		String s = new String("Good Evening");
		System.out.println(s);
		
		//by variable
		char ch[]= {'h','i'};
		//convert character array into String
		String s1=new String(ch);
		System.out.println(s1);
		System.out.println("Size of String: "+s1.length());
		String fname="shruti";
		String lname="hello";
		System.out.println(fname+lname);
		
		
		//equals method 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String username=sc.nextLine();
		System.out.println("Enter Password: ");
		String password=sc.nextLine();
		if(username.equals("admin")&& password.equals("admin"))
		{
			System.out.println("u can login");
		}
		else
		{
			System.out.println("Wrong credientials");
		}
		

	}

}
