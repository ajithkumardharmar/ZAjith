package durgasoft.oppsConcepts;

public class StaticControlFlowExample {
	static int i=10;
	static {
		m1();
		System.out.println("First Static block "+i);
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Main Static block");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("Second Static block");
	}
	static int j =20;
}
