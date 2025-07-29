package Com.practice.July2025;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "aabbcddce";
		
		Map<Character,Integer> countMap= new HashMap<>();
		
		for(int i=0;i<input.length();i++) {
			Character c = input.charAt(i);
			countMap.put(c, countMap.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
		}
	}
}
