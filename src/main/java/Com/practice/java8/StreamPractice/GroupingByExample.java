package Com.practice.java8.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Employee3> employees = Arrays.asList(
			    new Employee3("Alice", "HR", "New York"),
			    new Employee3("Bob", "Engineering", "San Francisco"),
			    new Employee3("Charlie", "HR", "New York"),
			    new Employee3("David", "Engineering", "New York"),
			    new Employee3("Eve", "HR", "Boston")
			);
		Map<String,Map<String,List<Employee3>>> resultEmployees = employees.stream().collect(Collectors.groupingBy(Employee3::getDepartment,Collectors.groupingBy(Employee3::getCity)));
		System.out.println(resultEmployees);
	}
}
class Employee3 {
    String name;
    String department;
    String city;

    public Employee3(String name, String department, String city) {
        this.name = name;
        this.department = department;
        this.city = city;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name;
    }
}
