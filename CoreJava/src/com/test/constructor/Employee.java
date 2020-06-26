package com.test.constructor;

public class Employee {

	String name;
	String id;
	String designation;
	String doj;
	String deptName;
	
	Employee() {
		System.out.println("Employee constructor");
	}

	void work(String deptName) {
		System.out.println("Depart name:"+deptName);
		// implementation.
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.work("Software");
		System.out.println("name"+e1.name);
		System.out.println("name"+e1.id);
		System.out.println("name"+e1.designation);
		System.out.println("name"+e1.deptName);
		
		
		//Employee e2 = new Employee();
		
	}

}
