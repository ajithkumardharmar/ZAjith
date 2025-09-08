package Com.practice.Aug2025;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,3,5};
		
		int n = nums.length+1;
		
		int maxSum = n *(n+1)/2;
		int actualSum = Arrays.stream(nums).sum();
		
		int missingNum = maxSum -actualSum;
		System.out.println(missingNum+ " is a missing number");
	}
}
