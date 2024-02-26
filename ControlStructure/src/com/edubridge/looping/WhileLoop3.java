package com.edubridge.looping;

import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to print table : ");
		int num = s.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num+"x"+i+"="+num*i);
			i++;
		}
		s.close();
		

	}

}
