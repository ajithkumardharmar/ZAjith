package Com.practice.Aug2025;

public class FindSecondHighestElement {
	public static void main(String[] args) {
		int[] nums = {2,1,7,5,9,14,11,8};
		int secondMax=findSecondHiegest(nums);
		System.out.println("Second Max Element : "+ secondMax);
	}

	private static int findSecondHiegest(int[] nums) {
		int maxVal=0;
		int SecondMax=0;
		for(int num : nums) {
			if(num>maxVal) {
				SecondMax = maxVal;
				maxVal=num;
			}else if(num>SecondMax && num!=maxVal) {
				SecondMax = num;
			}
		}
		return SecondMax;
		
	}
}
