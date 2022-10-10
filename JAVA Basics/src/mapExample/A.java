package mapExample;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(100, "Suravi");
		hashMap.put(21, "123");
		hashMap.put(32, "ad");
		hashMap.put(43, "scd");
		hashMap.put(5, "gfb");

		System.out.println(hashMap.get(1));
		
		System.out.println(hashMap);
	}
}
