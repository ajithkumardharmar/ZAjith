package Com.practice.Aug2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindElementFrequency {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		Map<String,Long> output=list.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()));
		
		System.out.println(output);
	}
}
