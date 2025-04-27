package durgasoft.Collections;

import java.util.TreeSet;

public class TreeSetWithComparator {
	
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new ComparatorExample());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		TreeSet<StringBuffer> set = new TreeSet<>();

        set.add(new StringBuffer("Apple"));
        set.add(new StringBuffer("Banana")); 
		
		System.out.println(set);
		
	}

}
