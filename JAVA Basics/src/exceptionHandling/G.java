package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class G {

	public static void main(String[] args){
		
		FileReader f;
		try {
			f = new FileReader("E:\\testing.txt");
			BufferedReader br = new BufferedReader(f);
			System.out.println(br.readLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
