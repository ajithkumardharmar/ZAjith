package durgasoft.Collections;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {
		int[] a = {2,1,6,4,8,3,5};
		System.out.println("Primitive array Before sort ");
		for(int n : a ) {
			System.out.println(n);
		}
		Arrays.sort(a);
		System.out.println("Primitive array After sort ");
		for(int n : a ) {
			System.out.println(n);
		}
		
		
		String[] s = {"Z","D","A","F","C"};
		System.out.println("Object array Before sort ");
		for(String n : s ) {
			System.out.println(n);
		}
		Arrays.sort(s);
		System.out.println("Object array After sort ");
		for(String n : s ) {
			System.out.println(n);
		}
		
		List l = Arrays.asList(1,2,4);
		//not able to add this is List view 
//		l.add(5);
		
	}
}
