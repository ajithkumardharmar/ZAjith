package durgasoft.Collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//Synchronized and thread safe
		Vector<Integer> v = new Vector<>();
		v.add(2);
		v.add(1);
		v.add(4);
		v.add(3);
		v.add(7);
		
		System.out.println(v);
		
	}
}
