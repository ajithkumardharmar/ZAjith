package Com.practice.datastructureAndAlgorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = {6,4,2,5,3,1};
		
		int[] result =bubbleSort(nums);
		
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] bubbleSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j+1]<nums[j]) {
					int temp =nums[j+1];
					nums[j+1] = nums[j];
					nums[j] =temp;
				}
			}
		}
		return nums;
	}

}
