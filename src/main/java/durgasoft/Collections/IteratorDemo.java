package durgasoft.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("Python")) {
                it.remove(); // safe removal
            } else {
                System.out.println(value);
            }
        }
    }
}

