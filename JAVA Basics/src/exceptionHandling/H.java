package exceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class H {

	public static void main(String[] args) {

		try {
			FileWriter w = new FileWriter("E:\\testfile.txt");
			BufferedWriter bw = new BufferedWriter(w);
			bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor ");
			bw.newLine();
			bw.write("incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
			bw.newLine();
			bw.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
			bw.newLine();
			bw.write("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
			bw.newLine();
			bw.write(" Excepteur sint occaecat cupidatat non proident,");
			bw.newLine();
			bw.write(" sunt in culpa qui officia deserunt mollit anim id est laborum.");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("File Read ");
		}

	}

}
