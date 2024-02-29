package Abstraction;
abstract class Bag{
	String type="my brand is American Tourist";
	abstract void show();
	
	void color(String color) {
		System.out.println("My Color: "+color);
	}
}
class BagInfo extends Bag{
	void show() {
		System.out.println("I am Bag");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		BagInfo b1 = new BagInfo();
		b1.show();
		System.out.println(b1.type);
		b1.color("Blue");

	}

}
