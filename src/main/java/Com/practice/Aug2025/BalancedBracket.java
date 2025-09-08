package Com.practice.Aug2025;

import java.util.Stack;

public class BalancedBracket {
	public static void main(String[] args) {
		String brack = "{[()()]}";

		boolean isBalanced= bracketCheck(brack);
		if(isBalanced) {
			System.out.println(" is Balanced Bracked");
		}else {
			System.out.println(" Not a Balanced Bracked");
		}
	}

	private static boolean bracketCheck(String brack) {
		Stack<Character> brackChecker = new Stack<>();

		for (char c : brack.toCharArray()) {
			if (c == '{') {
				brackChecker.push('}');
			} else if (c == '[') {
				brackChecker.push(']');
			} else if (c == '(') {
				brackChecker.push(')');
			} else if (brackChecker.isEmpty() || brackChecker.pop() != c) {
				return false;
			}
		}
		return brackChecker.isEmpty();

	}
}
