package com.edubridge.decisionmaking;

import java.util.Scanner;

public class CascasdeIfElseStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater " +a);
		}
		else if(b>c && b>a)
		{
			System.out.println("b is greater " +b);
		}
		else 
		{
			System.out.println("c one is greater " +c);
		}
		s.close();

	}

}
