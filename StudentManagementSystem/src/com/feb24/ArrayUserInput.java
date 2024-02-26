package com.feb24;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
