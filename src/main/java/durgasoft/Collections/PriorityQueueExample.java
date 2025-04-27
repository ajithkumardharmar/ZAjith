package durgasoft.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		PriorityQueue<String> q2 = new PriorityQueue<>(15,new MyComparator());
		q2.offer("A");
		q2.offer("Z");
		q2.offer("L");
		q2.offer("B");
		System.out.println(q2);
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}

}
