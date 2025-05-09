package Com.practice.java8.StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringWithStreamExample {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("apple", "banana", "pear", "apple", "kiwi", "banana", "grape");
		List<String> output =input.stream().distinct().sorted(Comparator.comparingInt(String::length)
				.thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
		System.out.println(output);
	}
}	

