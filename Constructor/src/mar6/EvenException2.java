package mar6;

import java.util.Scanner;

public class EvenException2 {
	void show() throws EvenException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=sc.nextInt();
		if(i%2==0) {
			throw new EvenException("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	

	public static void main(String[] args) {
		EvenException2	 t4=new EvenException2();
		try {
			t4.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
