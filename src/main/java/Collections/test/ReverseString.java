package Collections.test;

public class ReverseString {
	public static void main(String[] args) {
		String text ="Hello";
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb.toString());
		
		int a =10;
		int b = 20;
		
		a  = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swap a :"+a + " b: "+b);
		
	}
}
