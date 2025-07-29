package Com.practice.datastructureAndAlgorithms;

public class BinarySearch {
	public static void main(String[] args) {
		int [] nums = {1,3,5,6,7,8,10,12,15,17,26,36};
//		int[] nums = new int[1000];
		int target = 15;
		
		int index =binarySearch(nums,target);
		System.out.println(" Element Index : "+index);
		int left =0;
		int right =nums.length -1;
		int indexRec=binarySearchRecursive(nums,target,left,right);
		System.out.println(" Element Recursive Index : "+indexRec);
	}

	public static int binarySearch(int[] nums, int target) {
		
		int left =0;
		int right =nums.length -1;
		int step =0;
		while(left<=right) {
			step++;
			int mid = (left+right)/2;
			
			if(nums[mid]==target) {
				System.out.println("Steps taken binary : "+step);
				return mid;
			}else if(nums[mid]<target) {
				left =  mid+1;
			}else {
				right = mid-1;
			}
		}
		System.out.println("Steps taken binary : "+step);
		return -1;
		
	}
	public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
		 if (left > right) {
		        return -1;
		    }
			int mid = (left+right)/2;
			
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<target) {
				return binarySearchRecursive(nums,target, mid+1,right);
			}else {
				return binarySearchRecursive(nums,target, left,mid-1);
			}
			
	}
}
