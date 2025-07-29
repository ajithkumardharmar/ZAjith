package Com.practice.July2025;

public class FindMissingNumber {
	public static void main(String[] args) {
        int[] nums = {3, 0, 1,2,4,6,7,8};

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}
