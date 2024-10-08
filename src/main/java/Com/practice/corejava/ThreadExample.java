package Com.practice.corejava;
 
class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName() +"- count : "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(getName() + " was interrupted");
			}
		}
		System.out.println(getName() +"- count completed");
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		System.out.println("- Thread Start");
		t1.start();
		t2.start();
	}
}


