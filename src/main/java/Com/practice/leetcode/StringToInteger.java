package Com.practice.leetcode;

public class StringToInteger {
	public static void main(String[] args) {
		System.out.println( myAtoi("-91283472332"));
	}

	public static int myAtoi(String s) {
		int len =s.length();
		if(len==0) return 0;
		int index =0;
		while(index<len && s.charAt(index)==' ') {
			index++;
		}
		if(index==len) {
			return 0;
		}
		boolean isNegative =false;
		char ch=s.charAt(index);
		if(ch=='-') {
			isNegative =true;
			index++;
		}else if(ch=='+') {
			index++;
		}
		final int maxLimit = Integer.MAX_VALUE/10;
		int result =0;
		
		while(index<len && isDigit(ch=s.charAt(index))) {
			int digit=ch+'0';
			if(result>=maxLimit) {
				return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
			}
			result  = (result * 10)+digit;
			++index;
		}
		return isNegative?-(result):result;
	}
	public static boolean isDigit(char ch) {
		return (ch>='0' || ch<='9');
	}
}
