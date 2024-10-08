package Com.ZAjith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test implements TestInterface{


	
	
	public static void main(String[] args) {
		
		String userName = "Ajith";
		TestInterface demo =  (username) -> {System.out.println("Heloo"  + username); };
		
		
		demo.getUser(userName);
		
		List<String> user = new LinkedList<>();
		user.stream().filter(null);
		
		List<Employee> emp = new ArrayList<>();
		List<Bugs> demo1 = emp.stream().flatMap(i->i.tasks.stream().flatMap(j->j.bugs.stream())).toList();
		
		
		emp.forEach(i->{
			List<Task> t = i.tasks;
			t.stream().forEach(j->{
				List<Bugs> bus = j.bugs;
			});
		});
		
		List<String> data = emp.stream().map(i->i.empName).toList();
		
		List<Map<String, String>> daya = emp.stream().map(i->{
			Map<String, String> s = new HashMap<>();
			s.put(i.empId, i.empName);
			return s;
		}).toList();
		
		
		List<String> data1 = new LinkedList<>();
		
		data1.add("1");
		data1.add("2");
		data1.add("3");
		
		
		data1.add(2, "4");
		
		
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1);
		
		t1.start();
		
		
		Demo1 d2 = new Demo1();
		d2.start();
		
	}

	@Override
	public void getUser(String userName) {
		// TODO Auto-generated method stub
		
	}

}

@FunctionalInterface
interface TestInterface{
	
	public void getUser(String userName);

	
}



class Employee{
	
	public List<Task> tasks;
	public String empName;
	public String empId;
	
}

class Task {
	public List<Bugs> bugs;
}


class Bugs {
	public int bugNum;
}


class Demo extends Employee implements Runnable {

	@Override
	public void run() {
		
	}
	
}

class Demo1 extends Thread {

	
}

