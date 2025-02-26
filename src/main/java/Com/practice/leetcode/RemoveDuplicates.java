package Com.practice.leetcode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,2};
		System.out.println( removeDuplicates(nums));
	}
	
	 public static int removeDuplicates(int[] nums) {
		 int k= 1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i-1]!=nums[i]){
	                nums[k]=nums[i];
	                k++;
	            }
	        }
	        return k;
	    }
}
