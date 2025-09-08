package Collections.test;

import java.io.Serializable;

public class Employee implements Serializable {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private int employeeId;
		private String employeeName;
		private int departmentId;
		private transient double salary;
		
		
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public int getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
}
