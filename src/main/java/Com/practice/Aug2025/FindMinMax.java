package Com.practice.Aug2025;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindMinMax {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 30, 2, 8);
		OptionalInt maxVal=list.stream().mapToInt(e->e).max();
		OptionalInt minVal=list.stream().mapToInt(e->e).min();
		System.out.println("Max "+maxVal+" Min :"+minVal);
		
		Optional<Integer> maxVal2=list.stream().max(Integer::compareTo);
		Optional<Integer>  minVal2=list.stream().min(Integer::compareTo);
		System.out.println("Max "+maxVal2+" Min :"+minVal2);
	}
}
