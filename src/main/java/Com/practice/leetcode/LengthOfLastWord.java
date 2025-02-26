package Com.practice.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
	System.out.print(lengthOfLastWord("Hello World"));

	}
	public static int lengthOfLastWord(String s) {
        String[] sArr = s.trim().split("\\s+");
        String result = sArr[sArr.length-1];
        return result.length();
    }
}
