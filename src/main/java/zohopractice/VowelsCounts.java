package zohopractice;

public class VowelsCounts {
	public static void main(String[] args) {
		String input = "ZohoInterviewQuestion";
		countVowels(input);
	}
	public static void countVowels(String input) {
		input = input.toLowerCase();
		int vowelCount=0;
		int constents =0;
		for (int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch=='a' || ch=='e' || ch =='i' || ch == 'o' || ch=='u') {
				vowelCount++;
			}else {
				constents++;
			}
		}
		System.out.println("vowels count : "+vowelCount);
		System.out.println("Content count : "+constents);
	}
}
