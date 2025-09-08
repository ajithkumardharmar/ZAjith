package Com.practice.July2025;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
	public static void main(String[] args) {
		String t1 ="silent";
		String t2 = "listen";
		
		String r1 = Arrays.stream(t1.split("")).sorted().collect(Collectors.joining());
		String r2 = Arrays.stream(t2.split("")).sorted().collect(Collectors.joining());
		
		if(r1.equals(r2)) {
			System.out.println(" Is Anagram");
		}else {
			System.out.println(" Not Anagram");
		}
	}
}
