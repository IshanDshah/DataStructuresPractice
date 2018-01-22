package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(() -> {
			System.out.println("Hi lambda");
			System.out.println("Hi again lambda");
		}).start();

		Employee e1 = new Employee("Ishan", 27);
		Employee e2 = new Employee("shha", 47);
		Employee e3 = new Employee("jay", 57);
		Employee e4 = new Employee("jaz", 67);

		List<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Collections.sort(al, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
//		Collections.sort(al,new Comparable<Employee>() {
//
//			@Override
//			public int compareTo(Employee o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
		
		
		
		
		
	}

}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
