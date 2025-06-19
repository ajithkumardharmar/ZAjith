package Com.practice.corejava.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//import java.util.*;

public class SampleProgram {
	public static void main(String[] args) {
//		List<Integer> nums = Arrays.asList(2,3,-2,4);
//	       int result =0;
//	       for(int i=1;i<nums.size()-1;i++){
//	           int a  = nums.get(i);
//	           int b = nums.get(i-1);
//	           int prod = a*b;
//	           if(result<prod){
//	               result = prod;
//	           }
//	       }
//	      System.out.println(result);
		
//		int 
		
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

		Map<String, Long> sa= fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(sa);


	}
}
