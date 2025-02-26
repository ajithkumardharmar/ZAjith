package Com.practice.leetcode;

public class RemoveThreesDuplicate {
	 public static void main(String[] args) {
	        int[] nums = {1, 1, 1, 2, 2, 3};
	        int k = removeDuplicates(nums);
	        System.out.println("Output: " + k);  // Output: 5
	        System.out.print("Modified array: ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }

	private static int removeDuplicates(int[] nums) {
		int n = nums.length;
		if(n<=2) {
			return n;
		}
		int k=2;
		for(int i=2;i<n;i++) {
			if(nums[i]!=nums[k-2]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}
