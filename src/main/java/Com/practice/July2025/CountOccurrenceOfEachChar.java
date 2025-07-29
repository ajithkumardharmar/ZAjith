package Com.practice.July2025;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachChar {
	public static void main(String[] args) {
		String input ="hello";
		Map<Character,Long> result =input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(t->t,Collectors.counting()));
		System.out.println(result);
	}
}
