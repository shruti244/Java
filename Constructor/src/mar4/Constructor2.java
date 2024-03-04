package mar4;
class Student{
	String name;
	Student(){
		name="unknown";
		System.out.println(name);
		
	}
	Student(String n){
		name=n;
		System.out.println(name);
	}
}

public class Constructor2 {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2=new Student("Triveni Katkar");
		

	}

}
