package exceptionHandling;

public class A {

	public static void main(String[] args) {
		int i = 100;
		try {
		i = i/0;
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
