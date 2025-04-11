package durgasoft.oppsConcepts;



public class IS_A_RelationshipExample {
	public static void main(String[] args) {
		A2 a = new A2();
		a.m1();
		B2 b = new B2();
		b.m1();
		b.m2();
		A2 test = new B2();
		test.m1();
		//test.m2();  --> not able to use child class method 
	
		//B2 bTest = new A2(); --> not able to assign parent reference in child object
	}
}

class A2{
	public void m1() {
		System.out.println("M1 Run");
	}
}
class B2 extends A2{
	// if A2 class all method you need then use extends to inherite is IS-A Relationship
	public void m2() {
		System.out.println("M2 Run");
	}
}

