package class_object;

import java.util.Scanner;

class Student{
	String name;
	int age;
	void disp(String n,int a) {
		name = n;
		age=a;
		System.out.println("Student name: "+name+"\nStudent Age: "+age);
	}
}

public class EmployeeUsingFunction {

	public static void main(String[] args) {
		Student s1= new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name=sc.next();
		System.out.println("Enter Student age : ");
		 int age=sc.nextInt();
		 s1.disp(name, age);
		/*s1.disp("shruti", 19);
		s1.disp("Triveni", 20);
		s1.disp("mansi", 20);
		s1.disp("Pranay", 19);*/

	}

}
