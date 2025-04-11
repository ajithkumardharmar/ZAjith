package Com.practice.java8InterviewQuestion;

import java.util.stream.IntStream;

public class PrintFirst10EvenNumber {
	public static void main(String[] args) 
    {
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}
