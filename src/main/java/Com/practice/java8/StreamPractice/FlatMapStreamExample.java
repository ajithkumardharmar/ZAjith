package Com.practice.java8.StreamPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreamExample {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(Arrays.asList(new Item("Book", 12.99), new Item("Pen", 1.99))),
			    new Order(Arrays.asList(new Item("Laptop", 899.99))),
			    new Order(Arrays.asList(new Item("Notebook", 5.49), new Item("Pencil", 0.99)))
			);
		double sum =orders.stream().flatMap(orderInfo->orderInfo.getItems().stream()).mapToDouble(Item::getPrice).sum();
		System.out.println(sum);
//		You have a list of Order objects. Each Order has a list of Items.
//		You need to extract all unique item names across all orders, 
//		sorted alphabetically, and return them as an unmodifiable list.
		List<Order> orders2 = Arrays.asList(
			    new Order(Arrays.asList(new Item("Pen"), new Item("Notebook"))),
			    new Order(Arrays.asList(new Item("Pencil"), new Item("Notebook"))),
			    new Order(Arrays.asList(new Item("Eraser"), new Item("Pen")))
			);
		
		List<String> resultOrder=orders2.stream().flatMap(order->order.getItems().stream())
				   .map(Item::getName).distinct().sorted()
				   	.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		System.out.println(resultOrder);
	}
}
class Item {
    String name;
    double price;
    public Item(String name) {
        this.name = name;
    }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() { return name; }

    public double getPrice() { return price; }
    
}

class Order {
    List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() { return items; }
}
