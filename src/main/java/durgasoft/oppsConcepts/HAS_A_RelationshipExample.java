package durgasoft.oppsConcepts;

public class HAS_A_RelationshipExample {
	 public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}


class B{
	// if A class some method need then create object to get method is called HAS-A Relationship
	A a = new A();
	
	public void test() { 
		a.m1();
		System.out.println("B running");
	}
	
}
class A {
	public void m1() {
		System.out.println("A running");
	}
	public void m2() {
		System.out.println("A running");
	}
	public void m3() {
		System.out.println("A running");
	}
	public void m4() {
		System.out.println("A running");
	}
	public void m5() {
		System.out.println("A running");
	}
}