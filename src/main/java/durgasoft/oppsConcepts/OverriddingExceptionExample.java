package durgasoft.oppsConcepts;

import java.io.*;


public class OverriddingExceptionExample  {
	
	public static void main(String[] args) {
		C2 o = new C2();
		
		try {
			o.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				o.m2();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			o.m3();
		
	}
	
   public void m1() throws Exception {
	   System.out.println("Testing...");
   }
   public void m2() throws Exception {
	   System.out.println("Testing...");
   }
   public void m3() throws IOException {
	   System.out.println("Testing...");
   }
}
class C2 extends OverriddingExceptionExample{
	//If child class method throws checked exception then parent class method exception is same checked exception or parent exception
	@Override
	public void m1() throws Exception{
		 System.out.println("Testing..."); 
	 }
	
	@Override
	public void m2() throws IOException{
		 System.out.println("Testing..."); 
	 }
	//If child class method unchecked exception then no comparission required
	@Override
	public void m3() throws NullPointerException{
		 System.out.println("Testing..."); 
	 }
}
