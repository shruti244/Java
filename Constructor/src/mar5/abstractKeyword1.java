package mar5;
abstract class Student{
	abstract void attendance(int pd);
	
	void showName(String bc) {
		System.out.println("Batch code: "+bc);
	}
}
abstract class Lby{
	abstract void showModule(String modulename);
}
class Elites extends Student{
	void attendance(int pd) {
		System.out.println("Total days: "+pd);
	}
	
}
class Elites1 extends Lby{
	void showModule (String modulename) {
		System.out.println("Module running: "+modulename);
	}
}

public class abstractKeyword1 {

	public static void main(String[] args) {
		Elites e1= new Elites();
		e1.attendance(29);
		e1.showName("2023-24 11221");
		Elites1 e2= new Elites1();
		e2.showModule("Devops");

	}

}

