package durgasoft.declarationandmodifiers;

public class StaticVariableTest {
	static int x=100;
	int y = 50;
	public static void main(String[] args) {
		StaticVariableTest s1 = new StaticVariableTest();
		s1.x=66;
		s1.y=20;
		StaticVariableTest s2 = new StaticVariableTest();
		// x is static variable every object single copy only created
		System.out.println(s2.x+"  "+s2.y);
	}
	public static void m1() {
		System.out.println(x);
		//non static variable cannot use directly in static method
		//System.out.println(y);
	}
	public  void m2(String name) {
		System.out.println(x);
 		System.out.println(y);
	}
	public void m2(int id) {
		
	}
}
//inheritance concept applicable for static methods including main method
class SV extends StaticVariableTest {
	
}