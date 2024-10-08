package zohopractice;

import java.util.Arrays;

public class SortOddPositionDesc {
	public static void main(String[] args) {
		String inputStr = "13,2,4,15,12,10,5";
		System.out.println((oddPostionDes(inputStr)));
	}
	
	public static String oddPostionDes(String inp)  {
		String[] inpStrArr = inp.split(",");
		int[] numArr= Arrays.stream(inpStrArr).mapToInt(Integer::parseInt).toArray();
		int[] oddPosition = new int[(numArr.length+1)/2];
		int[] evenPosition = new int[numArr.length/2];
		int oddIndex=0;
		int evenIndex=0;
		StringBuilder result = new StringBuilder();
		for (int i=0;i<numArr.length;i++) {
			if(numArr[i]%2==0) {
				oddPosition[oddIndex++]=numArr[i];
			}else {
				evenPosition[evenIndex++] =numArr[i];
			}
		}
		Arrays.sort(evenPosition);
		Arrays.sort(oddPosition);
		evenIndex =0;
		oddIndex =oddPosition.length-1;
		for(int j=0;j<numArr.length;j++) {
			if(j%2==0) {
				result.append(oddPosition[oddIndex--]).append(",");
			}else {
				result.append(evenPosition[evenIndex++]).append(",");
			}
		}
		
		return result.substring(0,result.length()-1);
	}
}
