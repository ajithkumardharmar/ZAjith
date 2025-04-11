package Com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceExample {
	public static int doAddition(int i, int j) {
        return i + j;
    }
	public static void main(String[] args) {
		Cal sum = (i,j)->i+j;
		System.out.println(sum.add(6,7));
		//Method Reference
		Cal sum2 = FunctionalInterfaceExample::doAddition;
		System.out.println(sum2.add(21,7));
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<String> isNotNull = name -> name!=null && !name.isEmpty();
		System.out.println(isEven.test(6));
		System.out.println(isEven.test(7));
		System.out.println(isNotNull.test("Ak"));
		
		Function<String , Integer > strLength = str -> str.length();
		System.out.println(strLength.apply("Java"));
		System.out.println(strLength.apply("Ajith"));
		
		Consumer<String> printMessage = message-> System.out.println("Message : "+message);
		printMessage.accept("Hello  java 8");
		
		Supplier<Double> randomSupplier = ()->Math.random();
		System.out.println(randomSupplier.get());
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		
        // 1. Predicate – Filter names starting with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println); // Alice

        // 2. Function – Convert names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        names.stream().map(toUpperCase).forEach(System.out::println); // ALICE, BOB, CHARLIE, DAVID

        // 3. Consumer – Print names with a message
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        names.forEach(printName); // Name: Alice, Name: Bob, ...

        // 4. Supplier – Generate a random name
        Supplier<String> randomName = () -> names.get(new Random().nextInt(names.size()));
        System.out.println("Random Name: " + randomName.get());
        
        BiPredicate<Integer, Integer> isDivisible = (a, b) -> a % b == 0;

        System.out.println(isDivisible.test(10, 2)); // true
        System.out.println(isDivisible.test(10, 3)); // false
        
        BiFunction<Integer, Integer, Integer> totalPrice = (price, quantity) -> price * quantity;

        System.out.println("Total Price: " + totalPrice.apply(100, 5)); // 500
        
        BiConsumer<String, Integer> printPerson = (name, age) -> 
        System.out.println(name + " is " + age + " years old.");

    printPerson.accept("Alice", 25);
    printPerson.accept("Bob", 30);
    
 // UnaryOperator: Increase salary by 10%
    UnaryOperator<Double> increaseSalary = salary -> salary * 1.10;

    // BinaryOperator: Compare two salaries and return the higher one
    BinaryOperator<Double> maxSalary = (sal1, sal2) -> Math.max(sal1, sal2);

    // Testing UnaryOperator
    System.out.println("New Salary: " + increaseSalary.apply(50000.0)); // 55000.0

    // Testing BinaryOperator
    System.out.println("Higher Salary: " + maxSalary.apply(50000.0, 60000.0)); // 60000.0
		
	}
}

@FunctionalInterface
interface Cal{
	
	public int add(int i,int j); 
	
}

