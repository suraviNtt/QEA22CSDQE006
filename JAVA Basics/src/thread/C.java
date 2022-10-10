package thread;

public class C extends Thread{
	
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("Task CR");
		}
	}

	public static void main(String[] args) {
		C c = new C();
		c.start();
//		for(int i = 0 ; i < 100 ; i++) {
//			System.out.println("Task C");
//		}
		
	}
}
