package interfaceExample;

public class C implements A {

	@Override
	public void draw() {
		System.out.println("Draw Circle");

	}
	
	public static void main(String[] args) {
		
		C c = new C();
		c.draw();
		
		R r = new R();
		r.draw();
		
		A a = new C();
		a.draw();
		
		A a1 = new R();
		a1.draw();
	}

}
