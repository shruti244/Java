package accessmodifier;

public class B {

	public static void main(String[] args) {
		A a1=new A();
		a1.disp();
		
		C c1=new C();
		//error because method is private
		//c1.disp();

	}

}
