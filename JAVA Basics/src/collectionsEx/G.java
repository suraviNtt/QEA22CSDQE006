package collectionsEx;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class G {

	public static void main(String[] args) {
		Set<Integer> list = new TreeSet<Integer>();
		list.add(188);
		list.add(200);
		list.add(2);
		list.add(56);
		list.add(569);
		list.add(6);
		list.add(200);

		System.out.println(list);
		list.remove(188);
		System.out.println(list.contains(2001));

		System.out.println(list);
	}
}
