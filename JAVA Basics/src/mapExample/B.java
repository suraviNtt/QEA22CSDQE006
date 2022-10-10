package mapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) {
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("100", "Suravi");
		linkedHashMap.put("21", "123");
		linkedHashMap.put("32", "ad");
		linkedHashMap.put("43", "scd");
		linkedHashMap.put("5", "gfb");

		System.out.println(linkedHashMap.get(1));
		
		System.out.println(linkedHashMap);
		
		

	}
}
