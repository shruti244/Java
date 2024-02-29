package polymorphism;
class Maths{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	void add(String a,String b) {
		System.out.println(a+b);
	}
}
public class OverloadingPolymorphism {

	public static void main(String[] args) {
		Maths m1=new Maths();
		m1.add(10,20);
		m1.add("Hello","hi");
		m1.add(10,20,30);

	}

}
