package Com.practice.datastructureAndAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = {6,4,2,5,3,1};
		
		int[] result =selectionSort(nums);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] selectionSort(int[] nums) {
		for(int i =0;i<nums.length-1;i++) {
			int midIndex = i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[midIndex]) {
					midIndex=j;
				}
			}
			if(i!=midIndex) {
				int temp = nums[i];
				nums[i] = nums[midIndex];
				nums[midIndex] = temp;
			}
		}
		return nums;
	}

}
