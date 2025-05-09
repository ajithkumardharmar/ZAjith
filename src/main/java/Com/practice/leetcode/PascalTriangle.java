package Com.practice.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		
        if(numRows==0){ return new ArrayList<>(); }
        if(numRows==1){
            List<List<Integer>> triangle = new ArrayList<>();
            triangle.add(Arrays.asList(1));
            return triangle;
        }
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row = 0;row<numRows; row++ ){
            List<Integer> numList = new ArrayList<>();
            for(int col =0 ; col<=row ; col++){
                if(col==0 || col==row ){
                    numList.add(1);
                }else{
                    int num = triangle.get(row-1).get(col-1) 
                                + triangle.get(row-1).get(col);
                    numList.add(num);
                }
            }
            triangle.add(numList);
        }
        return triangle;
    }

    public static void main(String[] args) {
    	
        int rowIndex = 3;
        int numRows = rowIndex+1;
        List<List<Integer>> result = generate(numRows);
        List<Integer> result2= result.get(rowIndex);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
        System.out.println();
        System.out.println(result2);
    }
}
