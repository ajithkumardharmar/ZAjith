package Com.practice.Aug2025;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentCharecter {
	public static void main(String[] args) {
		String input = "kuamaran systems";
		Map<Character, Long> occurrChar = input.chars().mapToObj(c->(char)c).collect(
	    Collectors.groupingBy(t->t,Collectors.counting()));
		
		Optional<Entry<Character,Long>> result = occurrChar.entrySet().stream().max(Map.Entry.comparingByValue());
		
		result.ifPresent(entry->System.out.println(" Most Frequent char : "+ entry.getKey() + " value : "+entry.getValue()));
	}
}
