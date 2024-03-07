package mar6;

public class NullPointer {

	public static void main(String[] args) {
		try {
			
			String s="Shruti";
	
			System.out.println(s.length());
			
			int a=10,b=5;
			System.out.println(a/b);
			
			int arr[]=new int[5];
			System.out.println(arr[7]);
			try {
				String name1=null;
				System.out.println(name1.length());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}