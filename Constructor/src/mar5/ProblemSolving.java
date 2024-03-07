package mar5;
class GrandFather{
	void head() {
		System.out.println("Head of the family.");
	}

}
class Father extends GrandFather {
	int age1=48;
	void dispage1() {
		System.out.println("1st child of the family"+ age1);
	}
}
class Uncle extends GrandFather{
	int age2=45;
	void dispage2() {
		System.out.println("2nd child of the family"+ age2);
	}
		
	
}
class son extends Father{
	int age3=18;
	void dispage3() {
		System.out.println("2nd gen of the family "+ age3);
	}
	
}
class daughter1 extends Uncle{
	int age4=20;
	void dispage4() {
		System.out.println("1st daughter of the family " + age4);
	}
	
}
class daughter2 extends Uncle{
	int age5=20;
	void dispage5() {
		System.out.println("1st daughter of the family " + age5);
	}
	
}


public class ProblemSolving {

	public static void main(String[] args) {
		son s1= new son();
		s1.dispage1();
		s1.dispage3();
		daughter1 d1= new daughter1();
		d1.dispage2();
		d1.dispage4();
		daughter2 d2= new daughter2();
		d2.dispage2();
		d2.dispage5();
		
		
		

	}

}
