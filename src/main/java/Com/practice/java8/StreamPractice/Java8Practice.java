package Com.practice.java8.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.Optional;

public class Java8Practice {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9, 2, 6);
		int num =numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(num);
		
		List<Employee4> employees = Arrays.asList(
			    new Employee4("Alice", "HR", 40000),
			    new Employee4("Bob", "IT", 60000),
			    new Employee4("Charlie", "IT", 70000),
			    new Employee4("David", "HR", 45000),
			    new Employee4("Eve", "Finance", 50000)
			);
		
		Map<String, Double> avgSalaryByDept= employees.stream().collect(
				Collectors.groupingBy(Employee4::getDepartment,
				        Collectors.averagingDouble(Employee4::getSalary)));
		System.out.println(avgSalaryByDept);
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "apple");
		Map<String,Long> counting = words.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()));
		System.out.println(counting);
		
		List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10, 12);

		Integer result=numbers2.stream().filter(e->e>5 && e%4==0).findFirst().orElse(-1);
		System.out.println(result);
		
		List<String> names = Arrays.asList("Alice", "Arnold", "Bob", "Barry", "Charlie", "Catherine");
		Map<String, List<String>> groupedNames =names.stream().
				collect(Collectors.groupingBy(name->name.substring(0,1)));
		System.out.println(groupedNames);
		
		List<Integer> numbers3 = Arrays.asList(1, 4, 6, 9, 10, 13, 16, 18);
		Map<Boolean, List<Integer>> partitioned = 
				numbers3.stream()
			           .collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println(partitioned);
		
		
		double totalSalary=employees.stream().mapToDouble(Employee4::getSalary).sum();
		System.out.println(totalSalary);
		
		List<Employee5> employees5 = Arrays.asList(
			    new Employee5("Alice", "HR", "Mumbai"),
			    new Employee5("Bob", "IT", "Delhi"),
			    new Employee5("Charlie", "IT", "Delhi"),
			    new Employee5("David", "HR", "Mumbai"),
			    new Employee5("Eve", "Finance", "Chennai"),
			    new Employee5("Frank", "Finance", "Chennai")
			);
		
		Map<String,Map<String,List<Employee5>>> result2 = employees5.stream().collect(
				Collectors.groupingBy(Employee5::getCity,Collectors.groupingBy(Employee5::getDepartment)));
		
		System.out.println(result2);
		
		String s = "baseball";
		
		List<Character> resultChars= s.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.entrySet().stream().filter(ch->ch.getValue()>=2).map(Map.Entry::getKey).toList();
		
		System.out.println(resultChars);

	}
	

}
class Employee4 {
    String name;
    String department;
    double salary;
    
    public Employee4(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    // constructor, getters
}


class Employee5 {
    String name;
    String department;
    String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee5(String name, String department, String city) {
		super();
		this.name = name;
		this.department = department;
		this.city = city;
	}
    
    
    // constructor, getters
}

