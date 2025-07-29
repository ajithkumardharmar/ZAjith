package Com.practice.datastructureAndAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums ={5,4, 3, 2, 1};
		int [] result =insertionSort(nums);
		System.out.println(" Insertion Sort : "+ Arrays.toString(result));
	}

	private static int[] insertionSort(int[] nums) {
		
		for(int i=1;i<nums.length;i++) {
			int key = nums[i];
			int j=i-1;
			
			while(j>=0 && nums[j]>key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
		return nums;
	}
}
