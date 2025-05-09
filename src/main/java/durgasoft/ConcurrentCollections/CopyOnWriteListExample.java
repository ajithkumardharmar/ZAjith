package durgasoft.ConcurrentCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("One");
        list.add("Two");

        for (String s : list) {
            list.add("Three");  // No error!
            System.out.println(s);
        }

        System.out.println(list); // [One, Two, One, Two, Three]
    }
}

