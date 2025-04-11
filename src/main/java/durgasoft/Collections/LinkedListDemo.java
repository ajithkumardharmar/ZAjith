package durgasoft.Collections;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add("Ajith");
		l.addLast(20);
		l.add(true);
		l.add(32.5);
		l.add("Siva");
		l.add("ram");
		System.out.println(l);
		l.add(1, "Kumar");
		System.out.println(l);
		l.set(3, false);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Mr");
		System.out.println(l);
		
	}
}
