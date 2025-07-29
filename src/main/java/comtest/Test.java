package comtest;

public class Test  {
	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int c = a+b;
//		switch (c) {
//		case (c<30): {
//			
//			System.out.println(" c is less then 30 ");
//			
//		}case  (c>30):{
//			try {
//				
//			}catch(Exception e) {
//				
//			}
//		}
		
//		c+=10;
//		System.out.println(c);
//		
		ExampleThread exampleThread = new ExampleThread();
		Thread thread = new Thread(exampleThread);
		thread.start();
		Thread thread2 = new Thread(exampleThread);
		thread2.start();
		
		RecordExample rec = new RecordExample("Ajith", 25);
		System.out.println("Name : "+rec.name()+" Age : "+rec.age());
	}
}

class ExampleThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread running");
		
	}
	
}
