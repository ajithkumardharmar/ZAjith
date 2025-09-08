package Com.practice.July2025;

public class Rotate90Degree {
	public static void main(String[] args) {
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		printMatrix(nums);
		rotate90Degree(nums);
		System.out.println();
		printMatrix(nums);
	}

	private static void rotate90Degree(int[][] nums) {
		
		int n = nums.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp = nums[i][j];
				nums[i][j]  = nums[j][i];
				nums[j][i] = temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			reverse(nums[i]);
		}
		
	}

	private static void reverse(int[] numArr) {
		
		int left =0; 
		int right = numArr.length-1;
		
		while(left<right) {
			int temp = numArr[left];
			numArr[left] = numArr[right];
			numArr[right] = temp;
			left++;
			right--;
		}
		
	}
	
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
