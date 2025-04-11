package durgasoft.oppsConcepts;

public class MethodHiddingExample {
	public static void main(String[] args) {
		// Method Hidding
		System.out.println("Method Hidding");
		System.out.println();
		P p = new P();
		p.m1();
		C c = new C();
		c.m1();
		// If parent reference to create child object compiled code parent method will execute
		P p2 = new C();
		p2.m1();
		System.out.println("--------------------------");
		// Overridding 
		System.out.println("Overridding");
		System.out.println();
		p.m2();
		c.m2();
		// If parent reference to create child object Runtime code Child method will execute
		p2.m2();
		
	}
}
class P {
	public static void m1() {
		System.out.println("Parent Method");
	}
	public  void m2() {
		System.out.println("Parent Method");
	}
}
class C extends P{
	public static void m1() {
		System.out.println("Child Method");
	}
	@Override
	public  void m2() {
		System.out.println("Child Method");
	}
}
