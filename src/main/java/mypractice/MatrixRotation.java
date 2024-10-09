package mypractice;

public class MatrixRotation {
	 public static void main(String[] args) {
	        MatrixRotation solution = new MatrixRotation();

	        // Example 1
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        solution.rotate(matrix1);
	        System.out.println("Rotated Matrix 1:");
	        printMatrix(matrix1);

	        // Example 2
	        int[][] matrix2 = {
	            {5, 1 , 9, 11},
	            {2, 4 , 8, 10},
	            {13,3 , 6, 7},
	            {15,14, 12, 16}
	        };
	        solution.rotate(matrix2);
	        System.out.println("Rotated Matrix 2:");
	        printMatrix(matrix2);
	    }

	    private void rotate(int[][] matrix1) {
	    	int n=matrix1.length;
	    	for(int i=0;i<n;i++) {
	    		for(int j=i;j<n;j++){
	    			int temp = matrix1[i][j];
	    			matrix1[i][j] = matrix1[j][i];
	    			matrix1[j][i] = temp;
	    		}
	    	}
	    	
	    	for(int i=0;i<n;i++) {
	    		reverse(matrix1[i]);
	    	}
	    }

		private void reverse(int[] matrixRow) {
			int left=0;
			int right = matrixRow.length-1;
			while(left<right) {
				int temp = matrixRow[left];
				matrixRow[left] = matrixRow[right];
				matrixRow[right] = temp;
				left++;
				right--;
			}
			
		}

		// Function to print a matrix
	    private static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
}
