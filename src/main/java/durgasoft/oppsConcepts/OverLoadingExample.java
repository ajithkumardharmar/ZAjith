package durgasoft.oppsConcepts;

public class OverLoadingExample {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m1();
		t2.m1(10,20);
		t2.m1(10);
		t2.m1(10.5f);
		t2.m1('a'); //next level argument method available then that method will execute
		t2.m1(10l); //next level argument method available then that method will execute
		//t.m1(10.5);  // next level argument method not available then compile time error 
		System.out.println("----------------------------------------------------------------");
		Test3 t3 = new Test3();
		t3.m1(new Object());
		t3.m1("Ajith");
		t3.m1(null);
		
	}
}
class Test2{
	public void m1(int i) {
		System.out.println("general-int -->"+ i);
	}
	public void m1(int... i) {
		System.out.println("var-arg-int -->"+ i);
	}

	public void m1(float f) {
		System.out.println("float -->"+f);
	}

}
class Test3{
	public void m1(String s) {
		System.out.println("String version -->"+ s);
	}
	

	public void m1(Object o) {
		System.out.println("String version -->"+o);
	}

}
