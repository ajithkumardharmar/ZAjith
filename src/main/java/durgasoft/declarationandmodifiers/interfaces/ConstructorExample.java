package durgasoft.declarationandmodifiers.interfaces;

public class ConstructorExample {

	public static void main(String[] args) {
		
		// while creating child object then parent constructor also execute but not create 
		Child1 c = new Child1();
		System.out.println(c.hashCode()); // all the hashcode value same because child object only created

	}

}

class Parent1 {
	Parent1(){
		System.out.println(this.hashCode());
	}
}
class Child1 extends Parent1 {
	Child1(){
		System.out.println(this.hashCode());
	}
}