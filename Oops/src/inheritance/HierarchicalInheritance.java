package inheritance;
class Student{
	String name="Rahul";
	String address="Kalyan";
	String qualification="BSCCS";
}
class Course extends Student{
	String cName="Java Full Stack";
	int fees=5000;
}
class Placement extends Student{
	String compName="Capegemini";
	String ctc="5Lakh";
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Course c1= new Course();
		Placement p1 = new Placement();
		System.out.println("Student Name: "+c1.name+"\nStudent adress: "+c1.address
				+"\nStudent Qualification: "+c1.qualification+"\nStudent CourseName: "+c1.cName
				+"\nStudent Course fees: "+c1.fees +"\nCompany Name: "+p1.compName+"\nCTC: "+p1.ctc);

	}

}
