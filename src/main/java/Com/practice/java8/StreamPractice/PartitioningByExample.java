package Com.practice.java8.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 40);
		Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(result);
		
		List<Employee2> employees = Arrays.asList(
			    new Employee2("Alice", "HR", 50000),
			    new Employee2("Bob", "Engineering", 80000),
			    new Employee2("Charlie", "HR", 55000),
			    new Employee2("David", "Engineering", 90000),
			    new Employee2("Eve", "Sales", 60000)
			);
		Map<String,Double> employeeAvgSal = employees.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.averagingDouble(Employee2::getSalary)));
		System.out.println(employeeAvgSal);
	}
}

class Employee2 {
    String name;
    String department;
    double salary;

    public Employee2(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

