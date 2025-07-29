package Com.practice.Jun2025;

public class SwapingTwoNumbersWithoutTemp {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println("Befor swap "+a+" "+b);
		a =a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap "+a+" "+b);
		
		StringBuffer sb = new StringBuffer();
		sb.append("as");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("as");
		
	}
}
