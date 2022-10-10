package arrayExample;


public class A {

	public static void main(String[] args) {

		// static
		int i[] = new int[4];
		 i[0]=2; i[1] =3 ; i[2]=2; i[3]=6 ; 
		 
		 for(int n = 1 ; n<5 ; n++) {
			 i[n-1] = n;
		 }
		 
		for (int j : i) {
			System.out.println(j);
		}

		// dynamic
		int k[] = { 1, 2, 3, 5, 2, 8, 12, 11, 16, 13, 15, 20 };
		for (int j : k) {
			System.out.println(j);
		}
	}
}
