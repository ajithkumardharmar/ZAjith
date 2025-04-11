package durgasoft.MultiThreading;


class DemoYeild extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child : "+i);
			Thread.yield();
		}
	}
}

public class YeildExample {
	
	public static void main(String[] args) throws InterruptedException {
		DemoYeild t = new DemoYeild();
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main : "+i);
		}
	}

}
