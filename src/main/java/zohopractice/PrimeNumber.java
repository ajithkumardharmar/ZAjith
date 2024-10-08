package zohopractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=29;
		System.out.println("given number is prime or not "+isPrime(n));
	}
	public static boolean isPrime(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}
}
