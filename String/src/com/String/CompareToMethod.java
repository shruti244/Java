package com.String;

import java.util.Scanner;

public class CompareToMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String str1=sc.next();
		System.out.println("Enter Second String: ");
		String str2=sc.next();
		System.out.println("Enter Third String: ");
		String str3=sc.next();
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str1.compareTo(str3)); 
	}

}
