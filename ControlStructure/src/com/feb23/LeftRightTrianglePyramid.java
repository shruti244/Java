package com.feb23;

import java.util.Scanner;

public class LeftRightTrianglePyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row = s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=2*(row-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i; k++)
			{
                System.out.print("*");
            }
			System.out.println();
		}
		s.close();

	}

}
