package Com.practice.corejava;

public class SuperKeyExample extends parent {
	public static void main(String[] args) {
		SuperKeyExample example = new SuperKeyExample();
		example.doSomething();
	}
	@Override
	void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
		System.out.println("Child Running");
	}
}

class parent {
	void doSomething() {
		System.out.println("Parent Running");
	}
}

//class child extends parent{
//	@Override
//	void doSomething() {
//		// TODO Auto-generated method stub
//		super.doSomething();
//		System.out.println("Child Running");
//	}
//}

