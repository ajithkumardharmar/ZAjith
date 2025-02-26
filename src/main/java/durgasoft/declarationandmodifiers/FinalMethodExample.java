package durgasoft.declarationandmodifiers;

public class FinalMethodExample {
	public static void main(String[] args) {
		Childs c = new Childs();
		c.marry();
		c.property();
	}
}

class Parents {
	public void property() {
		System.out.println("Gold, cash, Jwells");
	}
	//if final key declared not able to override in child class
	public final void marry() {
		System.out.println("parent chosed girl");
	}
}
class Childs extends Parents{
	

}
