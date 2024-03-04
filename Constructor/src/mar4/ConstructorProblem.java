package mar4;
class Product{
	String Pname;
	int price;
	int quantity;
	String odate;
	String rdate;
	Product()
	{
		System.out.println("Welcome to our site ");
		System.out.println("Select your Product");
		
	}
	Product(String n, int p)
	{
		Pname=n;
		price=p;
		System.out.println("my product name is :"+Pname);
		System.out.println("Price of my product is : "+price);
	}
	Product(int q,String od,String rd)
	{
		quantity = q;
		odate=od;
		rdate=rd;
		System.out.println("Quantity of my Product is :"+q);
		System.out.println("Ordered date of my Product is :"+od);
		System.out.println("Received date of my Product is :"+rd);
		
	}
}

public class ConstructorProblem {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product("Speakers",20000);
		Product p3=new Product(2,"2nd March 2024","20th March 2024");
	

	}

}
