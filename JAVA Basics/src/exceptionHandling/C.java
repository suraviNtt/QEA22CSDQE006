package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class C {

	
	public static void main(String[] args) {
		
		File file = new File("E:\\testfile.txt");
		
		try {
			FileInputStream f = new FileInputStream(file);
		byte[] arr = 	f.readAllBytes();
			for(int i=0; i<arr.length; i++) {
				
				System.out.println((char) arr[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
