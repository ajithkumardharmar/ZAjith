package Com.practice.java8InterviewQuestion;

import java.util.stream.IntStream;

public class FindSumOfFirst10NaturalNumber {
	public static void main(String[] args) 
    {
        int sum = IntStream.range(1, 11).sum();
         
        System.out.println(sum);
    }
}
