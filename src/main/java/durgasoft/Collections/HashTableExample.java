package durgasoft.Collections;

import java.util.Hashtable;

class Temp2{
	int i;
	Temp2(int i){
		this.i =i;
	}
	public int hashCode() {
		return i;
	}
	
	public String toString() {
		return i+"";
	}
}

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<Object, String> h = new Hashtable<>();
		h.put(new Temp2(5), "A");
		h.put(new Temp2(2), "B");
		h.put(new Temp2(6), "C");
		h.put(new Temp2(15), "D");
		h.put(new Temp2(23), "E");
		h.put(new Temp2(16), "F");
		System.out.println(h);
	}
}
