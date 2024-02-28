package inheritance;
class Vehicle{
	double speed(double s) {
		return s;
		
	}
}
class Car extends Vehicle{
	String showColor(String color)
	{
		return color;
	}
}
class Bike extends Car{
	int showPrice(int Price)
	{
		return Price;
	}
}
class Bicycle extends Bike{
	int showYearModel(int year)
	{
		return year;
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		System.out.println("The speed of Vehicle is : "+b1.speed(9.77));
		System.out.println("The color of car is : "+b1.showColor("Black"));
		System.out.println("The Price of Bike is : "+b1.showPrice(60000));
		System.out.println("The year of  bicycle : "+b1.showYearModel(2004));

	}

}
