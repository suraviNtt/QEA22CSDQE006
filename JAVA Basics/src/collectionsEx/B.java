package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(188);
		list.add(0, 1000);
		list.add(200);
		list.add(2);
		list.add(56);
		list.add(569);
		list.add(6);
		list.add(4, 189);
		list.add(200);
		
		
		System.out.println(list);
		list.remove(0);
		Collections.sort(list);
		Collections.shuffle(list);
		System.out.println(list.contains(2001));
		
		System.out.println(list);
	}

}
