package Com.practice.java8.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "HR"),
			    new Employee("Bob", "Engineering"),
			    new Employee("Charlie", "HR"),
			    new Employee("David", "Engineering"),
			    new Employee("Eve", "Sales")
			);
		Map<String,List<String>> employeeGroups=employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment
									,Collectors.mapping(Employee::getName, 
											Collectors.collectingAndThen(Collectors.toList(), 
													list->list.stream().sorted().collect(Collectors.toList())))));
		System.out.println(employeeGroups);
	}
}

class Employee {
    String name;
    String department;

    // constructor, getters
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
}