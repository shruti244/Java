package com.String;

import java.util.Scanner;

public class VowelsAndConstants {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your sentence : ");
		String str=s.next();
		System.out.println("Sentence is : "+str);
		int Vcount=0 , Ccount=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				Vcount++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				Ccount++;
		}
		//Print the total number of vowels and constants
		System.out.println("The Total number of vowels is : "+Vcount);
		System.out.println("The Total number of Consonants is : "+Ccount);
	}

	

}
