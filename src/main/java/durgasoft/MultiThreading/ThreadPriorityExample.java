package durgasoft.MultiThreading;

class DemoThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child : "+i);
		}
	}
}

public class ThreadPriorityExample {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getPriority());
		//main thread now parent
//		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		DemoThread t = new DemoThread();
		// if parent thread priority has child thread priority
		System.out.println(t.getPriority());
		
		t.setPriority(9);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main : "+i);
		}
	}

}
