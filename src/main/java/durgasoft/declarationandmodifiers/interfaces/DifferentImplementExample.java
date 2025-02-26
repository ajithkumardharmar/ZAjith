package durgasoft.declarationandmodifiers.interfaces;

import java.io.Serializable;

interface Left{
	public void m1() ;
	public void m2() ;
	public String m3();
	//public void m4();
	int x = 77;
}
interface Right{
	public void m1() ;
	public void m2(int x) ;
	public Object m3();
	//public String m4(); //if use same name with different type return type compile error throw
	int x =88;
}

public abstract class DifferentImplementExample implements Left,Right {
	public static void main(String[] args) {
		System.out.println(Left.x);
		System.out.println(Right.x);
		
		//System.out.println(x); //reference name is ambiguous error  occurred
	}
	//in this case m1 one implemented method enough for two interface for same method, same argument, same return type
	@Override
	public void m1() {
		
	}
	//same method with different argument then must implement two methods its method overload
	@Override
	public void m2() {
		
	}
	@Override
	public void m2(int x) {
		
	}
	// same method , same arg , similar return also only one method enough
	@Override
	public String m3() {
		// TODO Auto-generated method stub
		return null;
	}	
}
class SubTest extends DifferentImplementExample {
	
}
