package durgasoft.MultiThreading;

public class RunnableDemo  {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		System.out.println(t1.getName());
//		 for(int i=0;i<10;i++) {
//			 System.out.println("Main Thread");
//		 }
		 Thread.currentThread().setName("Ajith");
		 System.out.println(Thread.currentThread().getName());
	}
	

}

 class MyRunnable implements Runnable{
	@Override
	public void run() {
		 for(int i=0;i<10;i++) {
			 System.out.println("Child Thread");
		 }
		
	}
}
