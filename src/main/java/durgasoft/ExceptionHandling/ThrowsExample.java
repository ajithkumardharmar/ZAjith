package durgasoft.ExceptionHandling;

import java.io.IOException;

public class ThrowsExample  {
	
	ThrowsExample() throws Exception{
		
	}
	public static void main(String[] args) throws InterruptedException {
		doStuff();
		try {
			throw new IOException("File not found"); // Handled inside method
		} catch (IOException e) {
			System.out.println("Handled Exception: " + e.getMessage());
		}
		try {
			System.out.println("Hello");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void doStuff() throws InterruptedException {
		doMoreStuff();
		
	}

	private static void doMoreStuff() throws InterruptedException {
		Thread.sleep(10000);
		
	}

}
