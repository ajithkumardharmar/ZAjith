package durgasoft.Collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> str = new Stack<>();
		
		str.push("A");
		str.push("B");
		str.push("C");
		str.push("D");
		str.push("E");
		System.out.println(str);
		str.pop();
		System.out.println(str);
		System.out.println(str.search("A"));
		System.out.println(str.search("Z"));
		
	}

}
