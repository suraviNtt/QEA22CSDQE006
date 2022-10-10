package absractExample;

public class B extends A
{

	@Override
	public void test1() {
		System.out.println("Test Abs 1");		
	}

	public static void main(String[] args) {
		
		A a = new B();
		a.test2();
	}
}
