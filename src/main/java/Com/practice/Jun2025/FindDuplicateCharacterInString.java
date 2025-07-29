package Com.practice.Jun2025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {
	public static void main(String[] args) {
		String name = "ajithkumari";
		Set<Character> nameChar = new HashSet<>();
		Set<Character> duplicateNameChar = new HashSet<>();
		for (int i = 0; i < name.length(); i++) {
			if (!nameChar.add(name.charAt(i))) {
				duplicateNameChar.add(name.charAt(i));
			}
		}
		System.out.println(duplicateNameChar);
		
		hashMapApproch(name);
		
		java8Approch(name);
	}

	private static void java8Approch(String name) {
		
		Map<Character,Long> groupedChar = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(t->t,Collectors.counting()));
		Set<Character> n=groupedChar.entrySet().stream().filter(i->i.getValue()>1).map(e->e.getKey()).collect(Collectors.toSet());
		System.out.println(n);
	}

	private static void hashMapApproch(String name) {
		HashMap<Character, Integer> duplicate = new HashMap<>();
		for(char c : name.toCharArray()) {
			duplicate.put(c, duplicate.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : duplicate.entrySet() ) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
	}
}
