package zohopractice;


public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 7, 18};
        int max = findLargest(arr);
        System.out.println("Largest element in the array: " + max);
    }
    public static int findLargest(int[] arr) {
    	int largeNumber=arr[0];
    	for(int i=0;i<arr.length-1;i++) {
    		if(largeNumber<arr[i+1]) {
    			largeNumber = arr[i+1];
    		}
    	}
		return largeNumber;
    }
}
