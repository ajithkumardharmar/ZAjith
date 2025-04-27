package durgasoft.Collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	public static void main(String[] args) throws InterruptedException {
		
		callHashMap();
		callWeakHashMap();
	}
	public static void callHashMap() throws InterruptedException{
		System.out.println("HashMap Started");
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);
		t= null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);
		System.out.println("HashMap Ended");
	}
	public static void callWeakHashMap() throws InterruptedException{
		System.out.println("WeakHashMap Started");
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);
		t= null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);
		System.out.println("WeakHashMap Ended");
	}
}
class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("gc called");
	}
}
