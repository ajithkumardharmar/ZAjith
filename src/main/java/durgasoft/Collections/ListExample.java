package durgasoft.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");
        names.add("A");
        names.add("H");
        
//        Collections.sort(names);
        
        names.add(5, "F"); // insert value in that index if alread have value will move next index
        names.set(3, "d"); //overwrite value in that index
        names.remove(1);       // Removes "B"
        names.remove("C");     // Removes the first "A" only
        
        System.out.println("After removing: " + names);  // [C, D, E, A]
        
        System.out.println("indexOf " + names.indexOf("A"));
        System.out.println("lastIndexOf " + names.lastIndexOf("A"));
        
        
        // Using Iterator to traverse
        ListIterator<String> listIterator = names.listIterator();//we can traverse forward, backword and element add , remove
        
        System.out.println("Iterating using Iterator:");
        while (listIterator.hasNext()) {
            String name = listIterator.next();
            System.out.println(name);
        }

        // Backward traversal
        System.out.println("Backward traversal:");
        while (listIterator.hasPrevious()) {
            String name = listIterator.previous();
            System.out.println(name);
        }
        

        System.out.println("After Iterator removal: " + names);  // [C, E, A]
        Collections.reverse(names);
        System.out.println("After Reversed list: " + names); 
    }
}
