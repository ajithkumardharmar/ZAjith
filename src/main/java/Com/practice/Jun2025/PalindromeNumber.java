package Com.practice.Jun2025;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 121;
		int input = num;
		int temp=0;
		int result =0;
		while(num>0) {
			temp = num%10;
			result =result*10+temp;
			num /=10;
		}
		if(input==result) {
			System.out.println("The given number is Palindrome");
		}else {
			System.out.println("The given number is not Palindrome");
		}
		System.out.println(result);
	}
}
