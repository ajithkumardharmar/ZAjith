package zohopractice;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        int[] result = removeDuplicates(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
	public static int[] removeDuplicates(int[] arr) {
		HashSet<Integer> uniqueSet = new HashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
		
		return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
	}
}
