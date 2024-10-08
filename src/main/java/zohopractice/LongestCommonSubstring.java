package zohopractice;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubstring {
	    public static void main(String[] args) {
	        String input1 = "ABCDGHW";
	        String input2 = "ACDGHR";

	        findLongestCommonSubstring(input1, input2);
	    }

	    public static void findLongestCommonSubstring(String input1, String input2) {
	        int m = input1.length();
	        int n = input2.length();

	        // Two 1D arrays to store lengths of common suffixes
	        int[] prev = new int[n + 1];  // To store the previous row results
	        int[] curr = new int[n + 1];  // To store the current row results

	        int maxLength = 0;  // Length of longest common substring
	        int endIndex = -1;  // To store the ending index of the longest common substring in input1

	        // Set to store all common substrings
	        Set<String> commonSubstrings = new HashSet<>();

	        // Iterate through both strings to fill the dp array
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (input1.charAt(i - 1) == input2.charAt(j - 1)) {
	                    curr[j] = prev[j - 1] + 1;

	                    // If there is a match, add all matching substrings from this point
	                    for (int len = 1; len <= curr[j]; len++) {
	                        commonSubstrings.add(input1.substring(i - len, i));
	                    }

	                    // Update maxLength and endIndex if a longer substring is found
	                    if (curr[j] > maxLength) {
	                        maxLength = curr[j];
	                        endIndex = i - 1;
	                    }
	                } else {
	                    curr[j] = 0;  // Reset the length if characters don't match
	                }
	            }

	            // Swap prev and curr arrays for next iteration
	            int[] temp = prev;
	            prev = curr;
	            curr = temp;
	        }

	        // Longest common substring
	        String longestCommonSubstring = input1.substring(endIndex - maxLength + 1, endIndex + 1);

	        System.out.println("Longest Common Substring: " + longestCommonSubstring);
	        System.out.println("Length of Longest Common Substring: " + maxLength);
	        System.out.println("All Common Substrings: " + commonSubstrings);
	    }
	}

