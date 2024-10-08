package zohopractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {
	public static void main(String[] arg) {
		String input = "aaasswiss";
		Map<Character,Integer> charCountMap = new LinkedHashMap<>();
		for (Character c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
		}
		char result = findFirstNonRepetedText(charCountMap);
		System.out.println("first non repeated text " + result);
	}
	public static char findFirstNonRepetedText(Map<Character, Integer> charCountMap) {
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return '_';
	}
}
