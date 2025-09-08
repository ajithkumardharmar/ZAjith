package Com.practice.Aug2025;

import java.util.Arrays;
import java.util.List;

public class StringTOUpperCase {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "stream", "api");
		List<String> output = list.stream().map(String::toUpperCase).toList();
		System.out.println(output);
	}
}
