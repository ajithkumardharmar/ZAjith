package durgasoft.oppsConcepts;

public class OverridingExample {
	public static void main(String[] args) {
		Child c = new Child();
		c.marry();
		Parent p = new Child();
		p.marry();
	}
}
class Parent{
	public void getProperty() {
		System.out.println("gold diamond");
	}
	public void marry() {
		System.out.println("parent choised");
	}
	
	public Object m1() {
		return null;
	}
}
class Child extends Parent{
	
	@Override
	public void marry() {
		System.out.println("i have choised");
	}
	//co variant retun type also same match
	@Override
	public String m1() {
		return "Name";
	}
}