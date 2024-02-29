package Encapsulation;
class Product{
	private int PID;
	private String pname;
	private int price;
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class Encapst {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setPID(101);
		p1.setPname("Speakers");
		p1.setPrice(2000);
		System.out.println(p1.getPID()+" "+"\n"+p1.getPname()+" "+"\n"+p1.getPrice());
	}

}
