package durgasoft.declarationandmodifiers;

public class ProtectedMemberModifiersExample {
	public static void main(String[] args) {
		System.out.print("Test");
	}
}

class Pr {
	int rollno;
	protected void Test() {
		System.out.println("protected member here");
	}
}
class Ch extends Pr{
	public static void main(String[] args) {
		Pr p = new Pr();
		p.Test();
		Ch c = new Ch();
		c.Test();
		Pr pc = new Ch();
		pc.Test();
	}
}
