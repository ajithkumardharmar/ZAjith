package Com.practice.Jun2025;

public class PalindromeString {
 public static void main(String[] args) {
	String str = "madam";
	boolean isPalindrome =true;
	for(int i=0;i<str.length()/2;i++) {
		if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
			isPalindrome = false;
			break;
		}
	}
	if(isPalindrome) {
		System.out.println("The given number is Palindrome");
	}else {
		System.out.println("The given number is not Palindrome");
	}
}
}
