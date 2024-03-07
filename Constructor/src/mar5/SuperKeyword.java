package mar5;

class Animal{
	void eat() {
		System.out.println("eat is function of Animal class");
	}
}
class Dog extends Animal{
	void eat() {
		super.eat();
		System.out.println("eat is function of Dog class");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("eat is function of Cat class");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Animal a1,a2;
		a1=new Dog();
		a2=new Cat();
		a1.eat();
		a2.eat();
	}

}
