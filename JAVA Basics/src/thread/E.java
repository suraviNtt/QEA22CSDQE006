package thread;

public class E {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
