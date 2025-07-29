package Com.practice.datastructureAndAlgorithms;

public class LinearSearch {
	public static void main(String[] args) {
//		int [] nums = {1,3,5,6,7,8,10,12,15,17,26,36};
		int[] nums = new int[1000];
		int target = 900;
		
		int index =linearSearch(nums,target);
		System.out.println(" Element Index : "+index);
	}

	public static int linearSearch(int[] nums, int target) {
		int step =0;
		for(int i=0;i<nums.length;i++) {
			step++;
			if(nums[i]==target) {
				System.out.println("Steps taken linear : "+step);
				return i;
			}
		}
		System.out.println("Steps taken linear : "+step);
		return -1;
		
	}
}
