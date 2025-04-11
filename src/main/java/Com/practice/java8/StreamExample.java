package Com.practice.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamExample {
	public static void main(String[] args) {
		Predicate<String> startWithA = name-> name.startsWith("A");
		List<String> nameList = Arrays.asList("Ajith","Babu","Vijay","Anbu","Ram");
		
		nameList.stream().filter(startWithA).forEach(System.out::println);
		
		List<Product> products = Arrays.asList(
	            new Product("Laptop", 55000),
	            new Product("Phone", 20000),
	            new Product("Mouse", 500),
	            new Product("Monitor", 12000)
	        );
		
		Predicate<Product> highPrice = price->price.getPrice()>15000;
		List<String> productNames = products.stream().filter(highPrice).map(p->p.name).toList();
		
		productNames.forEach(System.out::println);
		System.out.println("----------- optionalStr excute -------------  ");
		Optional<String> optionalStr = Optional.ofNullable(null);
		System.out.println(optionalStr.orElse("Default Value")); // Output: Default Value

        // Using ifPresent
		optionalStr.ifPresent(value -> System.out.println("Value is: " + value));
		System.out.println("----------- optionalStr2 excute -------------  ");
		Optional<String> optionalStr2 = Optional.ofNullable("Ajith");
		System.out.println(optionalStr2.orElse("Default Value")); // Output: Default Value
        // Using ifPresent
		optionalStr2.ifPresent(value -> System.out.println("Value is: " + value));
	}
}

class Product {
    String name;
    double price;
    
    Calculation calc = (i,j)->(i+j+10);
    Calculation calc2 = (i,j)->(i+j+20);

    public Product(String name, double price) {
    	int sum =calc.getAdd(3, 4);
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

@FunctionalInterface
interface Calculation{
	
	public int getAdd(int a, int b);
	
}
