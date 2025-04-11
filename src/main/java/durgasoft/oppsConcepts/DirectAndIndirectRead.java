package durgasoft.oppsConcepts;

public class DirectAndIndirectRead {
	static int i=10;
	static {
		m1();
		System.out.println(i); // Direct Read
	}
	private static void m1() {
		
		System.out.println(i); // Indirect Read
		
	}
	
	
}
