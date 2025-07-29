package Com.practice.Jun2025;

public class AmstrongCheck {
	public static void main(String[] args) {
		int result =0;
		int originalNumber =153;
		int num = originalNumber;
		int power = String.valueOf(num).length();
		int x = 0;
		while(num!=0) {
			x = num % 10;
			result += (int) Math.pow(x, power);
			num /=10;
		}
		if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number");
        }
	}
}
