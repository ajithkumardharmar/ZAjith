package durgasoft.declarationandmodifiers;

public class FinalClassExample {
	public static void main(String[] args) {
		
	}
}

class Parent {
	
}
final class Child extends Parent{
	

}
//GrandChild not able to extend child class beacause child class is final
class GrandChild  {
	
}
