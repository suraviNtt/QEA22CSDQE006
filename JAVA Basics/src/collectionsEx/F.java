package collectionsEx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class F {

	public static void main(String[] args) {
		Set<Integer> list = new LinkedHashSet<Integer>();
		list.add(188);
		list.add(200);
		list.add(2);
		list.add(56);
		list.add(569);
		list.add(6);
		list.add(200);

		System.out.println(list);
		list.remove(0);
		System.out.println(list.contains(2001));

		System.out.println(list);
	}
}
