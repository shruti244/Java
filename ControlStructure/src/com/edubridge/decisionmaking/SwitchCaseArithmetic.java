package com.edubridge.decisionmaking;

import java.util.Scanner;

public class SwitchCaseArithmetic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int ch = s.nextInt();
		System.out.println("Enter a value  : ");
		int a=s.nextInt();
		System.out.println("Enter b value  : ");
		int b=s.nextInt();
		switch(ch)
		{
		case 1: 
			int c=a+b;
			System.out.println("Addition : "+c);
		break;
		case 2: 
			int x=a-b;
			System.out.println("Subtraction : "+x);
		break;
		case 3: 
			int m=a*b;
			System.out.println("Multiplication : "+m);
		break;
		case 4: 
			int d=a/b;
			System.out.println("Division : "+d);
		break;
		default:
			System.out.println("wrong method");
		}
		
	}

}
