package durgasoft.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		for (String str : list) {
		    list.remove(str);  // Throws ConcurrentModificationException
		}

	}
}
class Main {
    public static void main(String[] args) {
    	List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (String item : list) { 
            if (item.equals("B") || item.equals("C")) {
                list.remove(item);  // ❌ Now modifying multiple times during iteration
            }
        }
        System.out.println("Done: " + list);
    }
}
