package durgasoft.Collections;

import java.util.TreeSet;

public class NavigableSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(500);
		t.add(1500);
		t.add(2000);
		t.add(2500);
		t.add(3500);
		t.add(4500);
		// NavigableSet interface methods 
		System.out.println(t);
		System.out.println(t.lower(2000)); // <2000
		System.out.println(t.ceiling(2000)); // <=2000
		System.out.println(t.higher(2000)); // >2000
		System.out.println(t.floor(2000)); // >=2000
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);
		
	}
}
