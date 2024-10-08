package zohopractice;

public class fibonacciSeries {
	public static void main(String[] args) {
        int n = 10;
        int firstval= 0;
		int secondval =1;
		int temp=0;
        for (int i = 1; i <= n; i++) {
        	
    		
    		
            System.out.print(firstval + " ");
            temp =firstval + secondval;
            firstval = secondval;
            secondval = temp; 
            
        }
    }
	
}
