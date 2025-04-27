package durgasoft.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,"A"));
		System.out.println(Collections.binarySearch(l,"L"));
		
		Collections.reverse(l);
		System.out.println(l);
		
	}
}
