package comtest;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
		Consumer<Integer> consumer =t->System.out.print("print consume : "+t);
		consumer.accept(5);
		Predicate<Integer> pre = s-> s%2==0;
		System.out.print(pre.test(5)); 
	}
}
