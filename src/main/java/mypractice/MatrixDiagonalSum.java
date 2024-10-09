package mypractice;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		MatrixDiagonalSum solution = new MatrixDiagonalSum();
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Diagonal Sum: " + solution.diagonalSum(matrix1)); // Output: 25
        
        int[][] matrix2 = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.println("Diagonal Sum: " + solution.diagonalSum(matrix2)); // Output: 8
    }

	private int diagonalSum(int[][] matrix1) {
		int len=matrix1.length;
		int sum =0;
		for(int i=0;i<len;i++) {
			sum+=matrix1[i][i];
			sum+=matrix1[i][len-1-i];
		}
		
		if(len%2!=0) {
			sum-=matrix1[len/2][len/2];
		}
		
		return sum;
	}

}
