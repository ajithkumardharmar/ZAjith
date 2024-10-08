
package zohopractice;

public class BinarySearchFindElement {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int target =5;
		System.out.println("Index : "+findElement(nums,target));
	}
	public static int findElement(int[] nums,int target){
		int left=0;
		int right =nums.length-1;
		int mid=0;
		while(left<=right) {
			mid = (right+left)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return -1;
	}

}
