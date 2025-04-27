package durgasoft.Collections;

import java.util.TreeMap;

public class NavigableMapExaple {
	public static void main(String[] args) {
		TreeMap<String,String> t = new TreeMap<>();
		t.put("b", "banana");
		t.put("a", "apple");
		t.put("e", "element");
		t.put("c", "cat");
		t.put("d", "dog");

		// NavigableMap interface methods  
		System.out.println(t);
		System.out.println(t.lowerKey("b"));
		System.out.println(t.floorKey("b"));
		System.out.println(t.higherKey("b"));
		System.out.println(t.ceilingKey("b"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingKeySet());
		System.out.println(t);
		
	}
}
