package durgasoft.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(101, "durga");
		m.put(102, "ravi");
		m.put(103, "Raju");
		m.put(104, "Mahesh");
		m.put(105, "Kannan");
		String n = m.put(101, "Ajith");
		System.out.println(n);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println(m.remove(102));
		Set s=m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Entry e = (Entry)i.next();
			if(e.getKey().equals(103)) {
				e.setValue("Raghav");
			}
			
		}
		System.out.println(m);
		
	}

}
