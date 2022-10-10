package mapExample;

import java.util.Map;
import java.util.TreeMap;

public class C {

	public static void main(String[] args) {
		Map<Integer, Object> treeMap = new TreeMap<Integer, Object>();
		treeMap.put(100, "Suravi");
		treeMap.put(21, 123);
		treeMap.put(32, true);
		treeMap.put(43, 1.002);
		treeMap.put(5, "gfb");

		System.out.println(treeMap.get(1));
		
		System.out.println(treeMap);
		
	}
}
