package durgasoft.oppsConcepts;

public class InstanceFlowExample {
	
		int i =10;
		//instance control flow every object create instance members will execute
		{
			m1();
			System.out.println("Parent First instance block");
		}
		InstanceFlowExample(){
			System.out.println("Parent Constructor");
		}
		//static control flow only one time loading
		static {
			System.out.println("Parent first static block");
		}
		private void m1() {
			System.out.println(i);
			
		}
		public static void main(String[] args) {
//			InstanceFlowExample instance = new InstanceFlowExample();
//			InstanceFlowExample instance2 = new InstanceFlowExample();
			System.out.println("Parent Main block");
		}
		{
			System.out.println("Parent Second instance block");
		}
		static {
			System.out.println("Parent Second static block");
		}
}

class ChildS extends InstanceFlowExample{
	int x =10;
	//instance control flow every object create instance members will execute
	{
		m2();
		System.out.println("Child First instance block");
	}
	ChildS(){
		System.out.println("Child Constructor");
	}
	//static control flow only one time loading
	static {
		System.out.println("Child first static block");
	}
	private void m2() {
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		ChildS childInstance = new ChildS();
		ChildS childInstance2 = new ChildS();
		System.out.println("Child Main block");
	}
	{
		System.out.println("Child Second instance block");
	}
	static {
		System.out.println("Child Second static block");
	}
}

