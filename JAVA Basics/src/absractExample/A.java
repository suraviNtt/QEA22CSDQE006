package absractExample;

public  abstract class A {
	
	A(){
		
	}

	public static void test() {
		System.out.println("Test Abs");
	}
	
	public void test2() {
		System.out.println("Test Abs 2");
	}
	public abstract void test1();
	
	public static void main(String[] args) {
		
		test();
	}
}
