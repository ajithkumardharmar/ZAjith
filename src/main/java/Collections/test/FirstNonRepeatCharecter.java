package Collections.test;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharecter {
	public static void main(String[] args) {
		String input = "madam";
		Map<Character,Integer> ch = new HashMap<>();
		for(int i=0;i<input.length();i++) {
			ch.put(input.charAt(i), ch.getOrDefault(input.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : ch.entrySet()){
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
