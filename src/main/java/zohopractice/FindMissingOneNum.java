package zohopractice;

import java.util.Arrays;

public class FindMissingOneNum {
	public static void main(String[] args) {
		int[] num = {3,7,1,2,8,4,5,6,10};
		System.out.println( getMissingNum(num));
	}
	public static int getMissingNum(int[] nums) {
		Arrays.sort(nums);
		int next =0;
		for(int i=0;i<nums.length;i++) {
			next = nums[i+1]-1;
			if(nums[i]!=next) {
				return next;
			}
		}
		return next;
	}
}
