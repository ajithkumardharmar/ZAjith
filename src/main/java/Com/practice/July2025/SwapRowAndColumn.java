package Com.practice.July2025;

import java.util.Arrays;

public class SwapRowAndColumn {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6}
		};
		
		int rows = matrix.length;
		int col = matrix[0].length;
		int[][] result = new int[col][rows];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				result[j][i] = matrix[i][j];
			}
		}
		
		 for (int[] row : result) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	}
}
