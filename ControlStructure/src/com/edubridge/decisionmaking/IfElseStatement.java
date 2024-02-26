package com.edubridge.decisionmaking;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=18 && weight>=45)
		{
			System.out.println("Eligible to Donate blood");
		}
		else
		{
			System.out.println("Not Eligible to Donate blood ");
		}
		s.close();

	}

}
