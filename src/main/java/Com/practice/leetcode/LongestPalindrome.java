package Com.practice.leetcode;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        
        System.out.println("Longest palindrome in 'babad': " + longestPalindrome(s1));
        System.out.println("Longest palindrome in 'cbbd': " + longestPalindrome(s2));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check for even length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);

            // Choose the longer palindrome
            int len = Math.max(len1, len2);

            // Update the start and end indices of the longest palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length of the palindrome is (right - left - 1)
        return right - left - 1;
    }
}

