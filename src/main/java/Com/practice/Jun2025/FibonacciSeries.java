package Com.practice.Jun2025;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 10;
		int a=0;
		int b=1;
		System.out.println(" Fibonacci Series "+a+" "+b+" ");
		for(int i =2;i<=num;i++) {
			int result = a+b;
			a=b;
			b=result;
			System.out.println(" "+result+" ");
		}
	}
}
