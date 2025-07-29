package Com.practice.Jun2025;

import java.util.Arrays;

public class AnagramChecker {
	public static void main(String[] args) {
		String str1 ="listen";
		String str2 ="silent";
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		if(Arrays.equals(chr1, chr2)) {
			System.out.println("Is Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}
}
