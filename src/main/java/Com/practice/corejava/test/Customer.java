package Com.practice.corejava.test;

public class Customer {
	
	private String Name ;
	
	private int age;
	
	private String location;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	public Customer(String name, int age, String location) {
		super();
		Name = name;
		this.age = age;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", age=" + age + ", location=" + location + "]";
	}
	
	
	
	
	

}
