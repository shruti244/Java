package polymorphism;

class Vehicle{
	void speed(int s) {
		System.out.println("Speed of vehicle: "+s);
	}
}
class Car extends Vehicle{
	void speed(int s) {
		System.out.println("Speed of Car: "+s);
	}
	
}
class Bus extends Vehicle{
	void speed(int s) {
		System.out.println("Speed of Bus: "+s);
	}
}
class Bicycle extends Vehicle{
	void speed(int s) {
		System.out.println("Speed of Bicycle: "+s);
	}
}

public class DynamicMethodDispatcher {

	public static void main(String[] args) {
		Vehicle V1,V2,V3;
		V1=new Car();
		V2=new Bus();
		V3=new Bicycle();
		V1.speed(89);
		V2.speed(58);
		V3.speed(40);
	
	}

}
