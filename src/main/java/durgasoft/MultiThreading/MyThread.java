package durgasoft.MultiThreading;

public class MyThread {
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}
class ThreadDemo extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
