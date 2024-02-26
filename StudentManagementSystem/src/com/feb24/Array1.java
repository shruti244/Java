package com.feb24;

public class Array1 {

	public static void main(String[] args) {
		//By Literal
		//returntype arrayname[]={};
		int arr[]= {10,20,30,40};
		
		//index start from 0
		//10 will be on 0 index no 20 will be on 1
		//arr[2] will fetch particular index value
		//System.out.println(arr[2]);
		
		
		//length is in-built method to check size of array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		//system.out.println(arr[10]); 
		//will give exception as exception out of bound
		}
	}


