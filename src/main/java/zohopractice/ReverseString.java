package zohopractice;

public class ReverseString {
	public static void main(String[] arg) {
		String text="ZOHO";
//		StringBuilder reverse=new StringBuilder();
//		for(int i=text.length()-1;i>=0;i--) {
//			reverse.append(text.charAt(i)) ;
//		}
//		System.out.println("hello "+ reverse.toString());
		String reverse="";
		for(int i=text.length()-1;i>=0;i--) {
			reverse+=text.charAt(i) ;
		}
		System.out.println("hello "+ reverse);
	}
}
