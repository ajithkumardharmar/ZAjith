package Com.practice.corejava;

class MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +" count : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(Thread.currentThread().getName()+" was interrupted ");
			}
		}
		System.out.println(Thread.currentThread().getName()+ " execution completed ");
	}
}

public class RunnableExample {
	
			public static void main(String[] args) {
				MyRunnable runnable = new MyRunnable();
				Thread t1 = new Thread(runnable,"Thread-1");
				Thread t2 = new Thread(runnable,"Thread-2");
				t1.start();
				t2.start();
				runnable.run();
				
			}
}
