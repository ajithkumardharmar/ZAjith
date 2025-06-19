package Com.practice.InterviewProblems;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		List<Employees> employeeList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Count :  ");
		int count = sc.nextInt();
		
		for(int i=0;i<count ; i++) {
			Employees emp = new Employees();
			
			System.out.println("Enter Employee Id  :  ");
			int empId = sc.nextInt();
			emp.setId(empId);
			sc.nextLine();
			
			System.out.println("Enter Employee Name  :  ");
			String empName = sc.nextLine();
			emp.setName(empName);
			
			System.out.println("Enter Employee Salary  :  ");
			double empSalary = sc.nextDouble();
			emp.setSalary(empSalary);
			
			employeeList.add(emp);
		}
		System.out.println(employeeList);
	}
}

class Employees{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}