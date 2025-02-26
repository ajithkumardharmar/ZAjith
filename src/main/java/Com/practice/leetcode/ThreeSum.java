package Com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums1)); // Output: [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {0, 1, 1};
        System.out.println(solution.threeSum(nums2)); // Output: []

        int[] nums3 = {0, 0, 0};
        System.out.println(solution.threeSum(nums3)); // Output: [[0, 0, 0]]
    }

	private List<List<Integer>> threeSum(int[] nums1) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums1);
		for(int i=0;i<nums1.length;i++) {
			if(i>0 && (nums1[i]==nums1[i+1])) continue; // skipp duplicate element
			
//			while
			
		}
		return result;
	}
}
