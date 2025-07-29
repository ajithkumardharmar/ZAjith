package Com.practice.July2025;

public class SumOf2DArray {
	public static void main(String[] args) {
		int [][] numArr = {
				{1,2,3},
				{4,5,6}
		};
		int sum=0;
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				sum += numArr[i][j]; 
			}
		}
		System.out.println("Sum of Array : "+sum);
	}
}
