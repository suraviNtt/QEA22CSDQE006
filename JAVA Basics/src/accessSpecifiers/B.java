package accessSpecifiers;

 final public class B extends A {

	static int j = 10;

 final	public void test() {
		System.out.println("B Test");
	}

	final public void test(int i) {
		System.out.println("B Test" + i);
	}

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.i);
		a.test();

		B b = new B();
		b.test();
		b.test(j);

		B.j = 20;
		b.test(j);
		A a1 = new B();
		a1.test();
	}
}
