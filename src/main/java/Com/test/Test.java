package Com.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String input = "abcabcbb";
		String result =findLongestUniqueSubstring(input);
		System.out.println(" Common substring : "+result);
	}

	private static String findLongestUniqueSubstring(String input) {
		String longest ="";
		for(int i=0;i<input.length();i++) {
			String current ="";
			Set<Character> uniqueChar = new HashSet<>();
			for(int j=i;j<input.length();j++) {
				char c = input.charAt(j);
				if(!uniqueChar.contains(c)) {
					uniqueChar.add(c);
					current +=c;
				}
			}
			if(current.length()>longest.length()) {
				longest = current;
			}
			
		}
		
		return longest;
	}
}
