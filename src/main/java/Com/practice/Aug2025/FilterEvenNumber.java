package Com.practice.Aug2025;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> output = list.stream().filter(i->i%2==0).toList();
		System.out.println(output);
	}
}
