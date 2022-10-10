package exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class F {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("E:\\testing.txt");
			fw.write("Suravi");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
