package Com.practice.Aug2025;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNonRepeateChar {
	public static void main(String[] args) {
		String input = "aabccdbe";
		Optional<Character> result = input.chars()
		  .mapToObj(c->(char) c)
		  .collect(Collectors.groupingBy(t->t,LinkedHashMap::new,Collectors.counting()))
		  .entrySet().stream().filter(e->e.getValue()==1)
		  .map(Map.Entry::getKey).findFirst();
	}
}
