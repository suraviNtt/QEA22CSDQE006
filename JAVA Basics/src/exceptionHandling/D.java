package exceptionHandling;

import java.io.FileOutputStream;

public class D {
	
	public static void main(String[] args) {
		
		String s = "Hello Everyone";
		byte[] data = s.getBytes();
		FileOutputStream fo;
		
		try {
			fo = new FileOutputStream("E:\\testing.txt");
			fo.write(data);
			fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
