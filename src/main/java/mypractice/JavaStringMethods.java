package mypractice;

public class JavaStringMethods {

	public static void main(String[] args) {
		System.out.println("executing testCodePointAt()  ");
		testCodePointAt("A","B");
		System.out.println("\nexecuting testContains() ");
		testContains();
		System.out.println("\nexecuting testCopyValueOf() ");
		testCopyValueOf();
		System.out.println("\nexecuting testIndexOf() ");
		testIndexOf();
		System.out.println("\nexecuting testLastIndexOf() ");
		testLastIndexOf();
	}
	private static void testIndexOf() {
		String myStr = "Ajith kumar kumar";
		System.out.println(myStr.indexOf("kumar"));
		
	}
	private static void testLastIndexOf() {
		String myStr = "Ajith kumar kumar";
	    System.out.println(myStr.lastIndexOf("kumar"));
		
	}
	public static void testCodePointAt(String n1,String n2) {
		if(n1.codePointAt(0)<n2.codePointAt(0)) {
			System.out.println(n1+" ==> "+n1.codePointAt(0));
		}else {
			System.out.println(n2+" ==> "+n2.codePointAt(0));
		}
	}
	
	public static void testContains() {
		String myStr = "Hello";
		System.out.println(myStr.contains("Hel"));   // true
		System.out.println(myStr.contains("e"));     // true
		System.out.println(myStr.contains("Hi"));    // false
	}
	
	public static void testCopyValueOf() {
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
		System.out.println("Returned String: " + myStr2);
	}
	
}
