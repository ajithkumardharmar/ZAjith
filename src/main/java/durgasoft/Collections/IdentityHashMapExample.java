package durgasoft.Collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		HashMap<Integer , String> m = new HashMap<>();
		m.put(i1, "Ajith");
		m.put(i2, "Kumar");
		System.out.println("HashMap");
		System.out.println(m);
		IdentityHashMap<Integer , String> im = new IdentityHashMap<>();
		im.put(i1, "Ajith");
		im.put(i2, "Kumar");
		System.out.println("IdentityHashMap");
		System.out.println(im);
		
		
	}

}
