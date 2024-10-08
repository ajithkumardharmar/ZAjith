package zohopractice;

public class AddAllNumber {
	public static void main(String[] args) {
		int sumIntArr=intArrNumAdd();
		System.out.println(" intArr sum : "+sumIntArr);
		int sumInt = intNumAdd();
		System.out.println(" int Sum : "+ sumInt);
		int sumString = addStringNum();
		System.out.println(" string sum : "+sumString);
	}
	public static int intArrNumAdd() {
		int[] numArr = new int[] {1,2,3,4};
		int sum = 0;
		for(int i=0;i<numArr.length;i++) {
			sum+=numArr[i];
		}
		return sum;
	}
	public static int intNumAdd() {
		int num =1234;
		int sum =0;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	public static int addStringNum() {
		String num ="1234";
		int sum=0;
		for(int i=0;i<num.length();i++) {
			char c= num.charAt(i);
			sum +=Character.getNumericValue(c); 
					
		}
		return sum;
	}
}
