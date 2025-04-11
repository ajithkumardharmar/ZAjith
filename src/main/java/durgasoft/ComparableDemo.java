package durgasoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

class Student implements Comparable<Student> {
	String name;
	
    int marks;

    public Student(int marks,String name) {
        this.marks = marks;
        this.name = name;
    }
    
    

    @Override
    public int compareTo(Student other) {
        return other.marks - this.marks; // descending order
    }

    public String toString() {
        return String.valueOf(name +"-"+marks);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(85,"Ajith"));
        list.add(new Student(95,"Siva"));
        list.add(new Student(75,"john"));

        Collections.sort(list); // uses Comparable
        System.out.println("Sorted in descending order: " + list);
        Collections.sort(list,Comparator.comparing(a->a.name)); // uses Comparable
        System.out.println("Sorted in descending order: " + list);
    }
}
