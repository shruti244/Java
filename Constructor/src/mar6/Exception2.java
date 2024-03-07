package mar6;

public class Exception2 {

	public static void main(String[] args) {
		try {
			String s="Welcome";
			System.out.println(s.lastIndexOf('e'));
			int a[]=new int[5];
			System.out.println(a[7]);
			
			int a1=10,b=2;
			System.out.println(a1/b);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			String email="shruti@gmail.com";
			System.out.println(email);
		}

	}

}
