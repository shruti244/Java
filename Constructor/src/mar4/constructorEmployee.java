package mar4;
class Employee{
	int id;
	String name;
	public Employee() {
		System.out.println("This is default comstructor");
	}
	public Employee(int i,String n) {
		id=i;
		name=n;
		System.out.println(id+" "+name);
	}
}

public class constructorEmployee {

	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee(156,"shruti");
	}

}
