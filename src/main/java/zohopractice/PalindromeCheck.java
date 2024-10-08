package zohopractice;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean checkPalindrome(String text) {
    	int size = text.length()-1;
    	for (int i=0;i<=size;i++) {
    		if(text.charAt(i)!=text.charAt(size)) {
    			return false;
    		}
    		size-=1;
    	}
    	return true;
    }
}
