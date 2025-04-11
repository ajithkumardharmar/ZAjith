package durgasoft.Collections;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Ajith");
        names.add("Siva");
        names.add("Ram");
        
        // Enumeration is legacy version 1.0 only for vector
        Enumeration<String> e = names.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

