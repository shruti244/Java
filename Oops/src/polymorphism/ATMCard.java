package polymorphism;
class Atm{
	void deposit(int d) {
		System.out.println("Deposit: "+d);
	}
	void withdrawl(int w) {
		System.out.println("withdrawl: "+w);
	}
}

public class ATMCard {

	public static void main(String[] args) {
		Atm a1= new Atm();
		a1.deposit(30000);
		a1.withdrawl(70000);
		
	}

}
