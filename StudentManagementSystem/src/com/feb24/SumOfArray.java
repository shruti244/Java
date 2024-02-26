package com.feb24;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		//userInput
		/*Scanner s =new Scanner(System.in);
		int[]arr=new int[7];
		System.out.println("Enter Elements of array: ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}*/
		int[]arr=new int[]	{1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The Sum of array elements is : "+sum);
		
	}
	

}
