package Com.practice.July2025;

public class StringPalindrome {
	public static void main(String[] args) {
		String input = "madam";
		
		if(checkPalindrome(input)) {
			System.out.println(" is Palindrome");
		}else {
			System.out.println(" Not Palindrome");
		}
	}

	private static boolean checkPalindrome(String input) {
		
		int left =0;
		int right = input.length()-1;
		
		while(left<right) {
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
		
	}
}
