package Com.practice.Aug2025;

import java.util.*;

public class URLCompression {

    public static int minimizeURLCompression(String url, int k) {
        Set<Character> uniqueChars = new HashSet<>();
        
        // Count unique characters in the URL
        for (char c : url.toCharArray()) {
            uniqueChars.add(c);
        }
        
        int distinctCount = uniqueChars.size();
        
        // Compression = k - number of distinct characters in subsequence
        // We can choose at most k characters, and at most 'distinctCount' unique ones
        int maxDistinctInSubsequence = Math.min(k, distinctCount);
        return k - maxDistinctInSubsequence;
    }

    // Test the function
    public static void main(String[] args) {
        String url = "aaaabbbb";
        int k = 5;
        int result = minimizeURLCompression(url, k);
        System.out.println("Minimum Compression: " + result);  // Output: 3
    }
}

