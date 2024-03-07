package mar5;
class Vehicle{
	void speed(int s) {
		System.out.println("Speed of vehicle: "+s);
	}
}
class Car extends Vehicle{
	void speed(int s) {
		super.speed(120);
		System.out.println("Speed of Car: "+s);
	} 
	
}
class Bus extends Vehicle{
	void speed(int s) {
		System.out.println("Speed of Bus: "+s);
	}
}
class Bicycle extends Car{
	void speed(int s) {
		System.out.println("Speed of Bicycle: "+s);
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		Vehicle v1,v2,v3;
		v1=new Car();
		v2=new Bus();
		v3=new Bicycle();
		
		v1.speed(80);
		v2.speed(20);
		v3.speed(70);
		
		

	}

}
