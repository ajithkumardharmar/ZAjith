package Com.practice.corejava;

public class findUnMatchedInt {
	public static void main(String[] args ) {
		Solutiona sol = new Solutiona();
		int[]  numbers= new int[]{2,1,2,1,5,3,3};
	
		System.out.println(sol.singleNumber(numbers));
		
	}
}
class Solutiona {
    public int singleNumber(int[] nums) {
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}