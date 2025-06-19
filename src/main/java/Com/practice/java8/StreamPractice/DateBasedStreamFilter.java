package Com.practice.java8.StreamPractice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DateBasedStreamFilter {
	public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
            new Employees("Ajith", "HR", LocalDate.of(2022, 5, 10)),
            new Employees("Kumar", "IT", LocalDate.of(2023, 1, 15)),
            new Employees("Divya", "Finance", LocalDate.of(2024, 3, 1)),
            new Employees("Ravi", "IT", LocalDate.of(2021, 9, 5))
        );

        // Filter employees who joined after 1st Jan 2023
        LocalDate dateFilter = LocalDate.of(2023, 1, 1);

        List<Employees> filteredEmployees = employees.stream()
            .filter(emp -> emp.getJoinDate().isAfter(dateFilter))
            .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);
    }
}



class Employees {
    private String name;
    private String department;
    private LocalDate joinDate;

    // Constructor
    public Employees(String name, String department, LocalDate joinDate) {
        this.name = name;
        this.department = department;
        this.joinDate = joinDate;
    }

    // Getters
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public LocalDate getJoinDate() { return joinDate; }

    @Override
    public String toString() {
        return name + " - " + department + " - " + joinDate;
    }
}
