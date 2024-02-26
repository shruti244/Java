package com.edubridge.decisionmaking;

import java.util.Scanner;

public class ProblemSolving {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your id : ");
		int id = s.nextInt();
		System.out.println("Enter your Name : ");
		String name =s.next();
		System.out.println("Enter your science marks : ");
		int science = s.nextInt();
		System.out.println("Enter your maths marks  : ");
		int maths = s.nextInt();
		System.out.println("Enter your english marks  : ");
		int english = s.nextInt();
	    int total =  science + maths + english ;
	    System.out.println("Total marks : "+total);
	    float avg = total/3;
	    System.out.println("Average  : " +avg);
		if(avg>=90)
		{
			System.out.println("Grade A");
		}
		else if(avg<=80 && avg>50)
		{
			System.out.println("Grade B");
		}
		else if(avg<=50 && avg>=35)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}
		s.close();
	}

}
