package Com.practice.Aug2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindOccurranceAndSortbyCount {
	public static void main(String[] args) {
		int arr[] = {1,2,4,2,5,6,4,2,6};
		List<Integer> numList = Arrays.asList(1,2,4,2,5,6,4,2,6);
		List<Integer> numList2 = List.of(1,2,4,2,5,6,4,2,6);
		Map<Integer, Long> occurrArr=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(t->t,Collectors.counting()));
		
		List<Entry<Integer,Long>> result = occurrArr.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
		
		System.out.println(result);
	}
	
}
