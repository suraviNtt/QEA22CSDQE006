package thread;

public class B extends Thread {
	
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("Task R");
		}
	}
	

	public static void main(String[] args) {
		B b = new B();
		b.start();
//		for(int i = 0 ; i < 100 ; i++) {
//			System.out.println("Task");
//		}
//		
		
		C c = new C();
		c.start();
	}
}
