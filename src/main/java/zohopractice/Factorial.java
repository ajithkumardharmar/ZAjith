package zohopractice;

public class Factorial {
	public static void main(String[] args) {
        int number = 6;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
	public static int factorial(int num) {
		int fact=1;
		if(num==0) {
			return 1;
		}
		while(num>0) {
			fact*=num;
			num--;
		}
		return fact;
	}
}
