package durgasoft.declarationandmodifiers.interfaces;

public class A implements InterfaceTest{
	public static void main(String[] args) {
		//x =10; --> interface variable value not able to modified in implement class
		System.out.println(x);
	}
}

class B implements InterfaceTest{
	public static void main(String[] args) {
		int  x= 15; // this is local variable not affect interface variable value
		System.out.println(x);
	}
}
