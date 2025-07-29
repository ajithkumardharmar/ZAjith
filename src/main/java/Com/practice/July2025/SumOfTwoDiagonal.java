package Com.practice.July2025;

public class SumOfTwoDiagonal {
	public static void main(String[] args) {
		//Two dimension array
		int[][] numArr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int n = numArr.length;
		int primary=0;
		int secondary=0;
		
		for(int i=0;i<n;i++) {
			primary+=numArr[i][i];
			secondary += numArr[i][n-i-1];
		}
		
		System.out.println("Sum of Primary diagonal : "+primary);
		System.out.println("Sum of Secondary diagonal : "+secondary);
		// method for overload main method 
		main("Ajith");
	}
	public static void main(String args) {
		System.out.println("Hello "+args);
	}
}
