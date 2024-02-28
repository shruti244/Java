package inheritance;
class Animal{
	void eat() {
		System.out.println("Animal class");
	}
}
class Dog extends Animal{
	String color="brown";
	void dispColor() {
		System.out.println("Dog colour: "+color);
	}
	
}
class Cat extends Animal{
	void bark() {
		System.out.println("Cat is barking");
	}
}
class BabyDog extends Dog{
	String age = "2Months";
	void dispAge() {
		System.out.println("The age of the baby dog is : "+age);
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		BabyDog b1 = new BabyDog();
		b1.dispAge();
		b1.dispColor();
		Cat c1=new Cat();
		c1.bark();
		c1.eat();
	}

}
