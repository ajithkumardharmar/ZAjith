package Com.practice.corejava.test;

import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {
	
	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		
		
		
		customerList.add(new Customer("Sathish", 36, "Bangalore"));
		customerList.add(new Customer("Priya", 40, "Chennai"));
		customerList.add(new Customer("Selva", 35, "Trichy"));
		customerList.add(new Customer("Mohan", 60, "Chennai"));
		customerList.add(new Customer("Hari", 23, null));
		
		
		
		
		
		List<String> belowAgeCustomerList =customerList.stream().filter(i->i.getAge()<40)
													.map(Customer::getName).toList();
		
		List<String> chennaiCustomerList =customerList.stream().
				filter(i->i.getLocation()!=null && i.getLocation().equals("Chennai"))
									.map(Customer::getName).toList();
		System.out.println("Below 40 age customer");
		belowAgeCustomerList.forEach(System.out::println);
		
		System.out.println("Chennai Location customer");
		chennaiCustomerList.forEach(System.out::println);
		
	}
}
