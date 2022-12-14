package thread;

public class D {

	int balance = 0;

	public synchronized void add() {
		for (int i = 0; i < 100; i++) {
			balance += i;
			System.out.println(balance);
		}
	}

	public synchronized void sub() {
		for (int i = 0; i < 100; i++) {
			balance -= i;
			System.out.println(balance);
		}
	}

	public void account() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				add();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				sub();

			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		D a = new D();
		a.account();

	}

}
