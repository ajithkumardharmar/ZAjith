package zohopractice;

public class ExpandString {
	public static void main(String[] args) {
		String input="a1b10c5d4";
		System.out.println(getExpandString(input));;
	}
	public static String getExpandString(String input) {
		StringBuilder  result = new StringBuilder();
		StringBuilder number = new StringBuilder();
		char c=0;
		char currentChar=0;
		for (int i=0;i<input.length();i++) {
			c = input.charAt(i);
			if(Character.isLetter(c)) {
				currentChar = c;
				number.setLength(0);
			}else if(Character.isDigit(c)) {
				number.append(c);
				if(i+1==input.length() || Character.isLetter(input.charAt(i+1))) {
					int count = Integer.parseInt(number.toString());
					for(int j=0;j<count;j++) {
						result.append(currentChar);
					}
				}
			}
		}
		return result.toString();
	}
}
