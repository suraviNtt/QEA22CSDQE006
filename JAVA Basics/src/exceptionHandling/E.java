package exceptionHandling;

import java.io.FileReader;

public class E {

	public static void main(String[] args) {
		 
		try {
			FileReader r = new FileReader("E://testfile.txt");
			int i ;
			 while((i=r.read())!=-1) {   
		          System.out.println((char)i);   
			 }
		          r.close();    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
