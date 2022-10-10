package accessSpecifiers;

public class A {

	public int i = 20;

	//complie time polymorphism and overloading
	public void test() {
		System.out.println("Test");
	}

	public void test(int i) {
		System.out.println("Test" + i);
	}
	
	public void test(String i) {
		System.out.println("Test"+i);
	}
	
	public void test(String str , int i) {
		System.out.println("Test" + str +", "+i);
	}

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.i);
		a.test();
		a.test(1);
		a.test("xyz");
		a.test("abc", 10);
	}

}
