package mypractice;

public class StringReverseTest {
	public static void main(String[] args) {
		String name ="Ajith";
		String result = "";
		for(int i=name.length()-1;i>=0;i--) {
			result += name.charAt(i);
		}
		System.out.println(result);
		int fact = getFactorial(5);
		System.out.println(fact);
	}
	
	public static int getFactorial(int fact) {
		int result =1;
		while(fact>0) {
			result *=fact;
			fact--;
		}
		return result ;
	}

}
