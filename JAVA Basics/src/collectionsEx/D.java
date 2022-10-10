package collectionsEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class D {

	public static void main(String[] args) {

		Queue<Integer> list = new PriorityQueue<Integer>();
		list.add(188);
		list.add(200);
		list.add(2);
		list.add(56);
		list.add(569);
		list.add(6);
		
		System.out.println(list);
		list.remove(200);
		System.out.println(list.contains(2001));
		System.out.println(list);
		list.peek();
		list.poll();
		System.out.println(list);
		list.peek();
		list.poll();
		System.out.println(list);

	}
}
