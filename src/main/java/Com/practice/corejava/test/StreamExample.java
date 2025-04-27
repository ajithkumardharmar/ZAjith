package Com.practice.corejava.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {
	 public static void main(String[] args) {
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "date", "banana", "apple");
		 
		 Map<String,Long> wordCount = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		 System.out.println(wordCount);
		 
		 Map<String,Long> sortedWordCount  = wordCount.entrySet().stream()
				 .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,
						 Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		 
		 System.out.println(sortedWordCount);
		 
		 Map<String,Long> keyBasedSortedWordCount= wordCount.entrySet().stream().sorted(Map.Entry.comparingByKey())
				 			.collect(Collectors.toMap(Map.Entry::getKey, 
				 				Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		 
		 System.out.println(keyBasedSortedWordCount);
		 
		 
		 
		 
	}
}
