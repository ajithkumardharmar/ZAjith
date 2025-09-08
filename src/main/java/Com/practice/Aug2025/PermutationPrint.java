package Com.practice.Aug2025;

public class PermutationPrint {
	public static void main(String[] args) {
		String input ="abc";
		printPermutation("",input);
	}

	private static void printPermutation(String prefix, String remainingStr) {
		
		if(remainingStr.length()==0) {
			System.out.println(prefix);
			return;
		}
		
		for(int i=0;i<remainingStr.length();i++) {
			char ch = remainingStr.charAt(i);
			String before = remainingStr.substring(0,i);
			String after = remainingStr.substring(i+1);
			printPermutation(prefix+ch, before+after);
		}
		
	}
}
