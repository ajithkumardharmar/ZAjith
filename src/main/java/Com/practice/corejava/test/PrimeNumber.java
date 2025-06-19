package Com.practice.corejava.test;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean isPrime = isPrimeNumber(6);
		System.out.println(isPrime);
	}

	private static boolean isPrimeNumber(int n) {
		
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
}
