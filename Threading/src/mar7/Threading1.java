package mar7;

public class Threading1 extends Thread{
	public void run() {
		System.out.println("This is thread class run method ");
	}
	public void disp() {
		System.out.println("This is disp method ");
		
	}

	public static void main(String[] args) {
		Threading1 t =new Threading1();
		t.run();
		t.start();

	}

}
