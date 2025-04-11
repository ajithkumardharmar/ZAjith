package durgasoft.MultiThreading;

import java.util.Collection;
import java.util.Collections;

class DemoJoin extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child : "+i);
			try {
				// 2 seconds thread wait then will execute
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JoinExample {
	
	public static void main(String[] args) throws InterruptedException {
		DemoJoin t = new DemoJoin();
		t.start();
		// join method wait for DemoJoin thread complete 10 seconds only if time expire main thread will run
		t.join(10000);
		for(int i=1;i<=10;i++) {
			System.out.println("Main : "+i);
		}
	}

}

