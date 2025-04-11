package durgasoft.ExceptionHandling;

public class ExceptionExample {
	static ArithmeticException es;
	public static void main(String[] args) {
		
		System.out.println("st-1");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw es;
		}finally {
			System.out.println("st-2");
		}
		System.out.println("st-3");
	}

}
