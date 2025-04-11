package durgasoft.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        ListIterator<String> li = list.listIterator();

        // Forward
        while (li.hasNext()) {
            String value = li.next();
            if (value.equals("Two")) {
                li.set("TWO");  // update
            }
        }

        // Backward
        System.out.println("Backward traversal:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}

