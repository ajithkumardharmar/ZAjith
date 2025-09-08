package Com.practice.July2025;

public class PrintTwoDiagonal {
	public static void main(String[] args) {
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int len = nums.length;
		System.out.println(" Front Diagonal ");
		for(int i=0;i<len;i++) {
			System.out.println(nums[i][i]);
		}
		System.out.println(" Back Diagonal ");
		for(int i=0;i<len;i++) {
			int n = len - i -1;
			System.out.println(nums[i][n]);
		}
	}
}
