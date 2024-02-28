package inheritance;
class AccountHolder
{
	void info(String accNo,String name)
	{
		
		System.out.println("Account Number: "+accNo+"\nAccount Name: "+name);
	}
}
class Bank extends AccountHolder{
	void getRoi(double roi)
	{
		System.out.println("Bank interest: "+roi);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		//AccountHolder a1= new AccountHolder();
		//a1.info("175","shruti");
		Bank b1=new Bank();
		b1.getRoi(3.6);
		b1.info("145", "triveni");
		

	}

}
