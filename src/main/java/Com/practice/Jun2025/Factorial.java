package Com.practice.Jun2025;

public class Factorial {
	public static void main(String[] args) {
		int num =5;
		int result =1;
		while(num>0) {
			result *=num;
			num--;
		}
		System.out.println(result);
	}
}
