package Com.practice.Aug2025;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		int num =13;
		
		boolean isPrime=checkPrimeNumber(num);
		
		if(isPrime) {
			System.out.println("is prime number");
		}else {
			System.out.println("not a prime number");
		}
	}

	private static boolean checkPrimeNumber(int num) {
		if(num<=1) {
			return true;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
