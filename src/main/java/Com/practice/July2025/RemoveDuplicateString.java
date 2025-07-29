package Com.practice.July2025;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String input = "Programming";
		removeDuplicateString(input);
		
	}

	private static void removeDuplicateString(String input) {
		
		StringBuilder result = new StringBuilder();
		LinkedHashSet<Character> seen = new LinkedHashSet<>();
		
		for(char c: input.toCharArray()) {
			if(seen.add(c)) {
				result.append(c);
			}
		}
		System.out.println(result.toString());
	}
}
