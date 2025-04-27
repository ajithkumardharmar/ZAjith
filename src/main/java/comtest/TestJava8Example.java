package comtest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava8Example {
	public static void main(String[] args) {
		String s1 = "RaceCar";
		String s2 = "CarRace";
		
		 s1 = Stream.of(s1).map(String::toUpperCase).sorted().collect(Collectors.joining());
		 s2 = Stream.of(s2).map(String::toUpperCase).sorted().collect(Collectors.joining());
		 
		 if(s1.equals(s2)) {
			 System.out.println("String is Anagram");
		 }else {
			 System.out.println("String is Anagram");
		 }
		
	}
}
