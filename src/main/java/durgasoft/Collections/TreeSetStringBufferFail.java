package durgasoft.Collections;

import java.util.TreeSet;

public class TreeSetStringBufferFail {
    public static void main(String[] args) {
        TreeSet<StringBuffer> set = new TreeSet<>();

        System.out.println("Set implementation: " + set.getClass().getName());
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Vendor: " + System.getProperty("java.vendor"));

        set.add(new StringBuffer("Apple"));    // OK
        set.add(new StringBuffer("Banana"));   // Should throw ClassCastException

        System.out.println("Class of first element: " + set.first().getClass().getName());
        System.out.println(set);
    }
}



