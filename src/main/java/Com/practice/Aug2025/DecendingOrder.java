package Com.practice.Aug2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecendingOrder {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 1, 3, 9, 2);
		List<Integer> output = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(output);
	}
}
