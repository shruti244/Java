package mar6;
import java.util.Scanner;

public class Exception3 {
	//use of voting class
		void show() throws Voting {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter age");
			int age=sc.nextInt();
			if(age<18) {
				throw new Voting("not eligible for voting");
			}
			else {
				System.out.println("Eligible for voting");
			}
		}


	public static void main(String[] args) {
		Exception3 t=new Exception3();
		try {
			t.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		


	}


