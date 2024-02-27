package feb26;

import java.util.Scanner;

public class Min_MaxArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int array[]= {5,3,7,2,8,9,1,4};
		
		System.out.println("Enter size of array: ");
		int size=s.nextInt();
		int array[]=new int[size];
		System.out.println("Enter Elements of array: ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println("List of array: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				//update minimum value
				max=array[i];
			
			}
			if(array[i]<min)
			{
				//update minimum value
				min=array[i];
			
			}
		}
		System.out.println("\nMaximum value : "+max);
		System.out.println("Maximum value : "+min);
		
		

	}

}
