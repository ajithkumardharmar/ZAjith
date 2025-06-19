package Com.practice.InterviewProblems;

import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class FindFirstNonRepeatedCharacter {
	public static void main(String[] args) {
		findFirstNonRepeatedChar("aabbbcccdefff");
	}

	private static void findFirstNonRepeatedChar(String words) {
		
//		Arrays.stream(words.split(""))
		Scanner scanner = new Scanner(System.in);
		String words2 = scanner.nextLine();
		System.out.println(words2);
		Map<Character,Integer> freq = new LinkedHashMap<>();
		
		for(char ch : words2.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch,0)+1);
		}
		
		Character result = freq.entrySet().stream().filter(i->i.getValue()==1)
				.map(Map.Entry::getKey).findFirst().get();

		System.out.println(result);
		
	}
}
