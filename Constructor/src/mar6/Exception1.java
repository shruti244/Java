package mar6;

public class Exception1 {

	public static void main(String[] args)
	{
			try {
				
				int i=1,j=0;
				System.out.println(i/j);
				System.out.println("Hello");
			}
			catch(Exception e) {
				//printStackTrace-trace the error
				e.printStackTrace();
				//System.out.println(e);
				//e.getMessage();
			}
	
	}
	}


