package zohopractice;


public class ReverseStringWord {
	public static void main(String[] args) {
		String text="The   sky is blue";
		System.out.println(getReverseString(text));
	}
	public static String getReverseString(String text) {
		StringBuilder result = new StringBuilder();
		String[] textArr=text.split("\\s+");
		for(int i=textArr.length-1;i>=0;i--) {
			result.append(textArr[i]).append(" ");
		}
		
		return result.substring(0,result.length()-1);
	}

}
