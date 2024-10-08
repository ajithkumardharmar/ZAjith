package zohopractice;

public class LongestSumOfContgiousArr {
	public static void main(String[] args) {
		int[] num= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(langestSumArr(num));
	}
	public static int langestSumArr(int[] numArr) {
		int currMax=numArr[0];
		int globalMax = numArr[0];
		for (int i=1;i<numArr.length;i++) {
			currMax = Math.max(numArr[i], currMax+numArr[i]);
			if(currMax>globalMax) {
				globalMax=currMax;
			}
		}
		return globalMax;
	}
}
