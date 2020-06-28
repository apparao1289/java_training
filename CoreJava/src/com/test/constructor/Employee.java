package com.test.constructor;

import com.test.array.AdditionOfTwoMatrix;

public class Employee {

	String name;
	int id;
	String designation;
	String doj;
	String deptName;
	
	public Employee() {
		System.out.println("Employee constructor");
		System.out.println("name:"+this.name);
		System.out.println("id:"+this.id);
		System.out.println("designation:"+this.designation);
		System.out.println("deptName:"+this.deptName);
		System.out.println("doj:"+this.doj);
	}
	
	protected Employee(String name,int id,String designation) {
		System.out.println("Employee 3 parameter constructor");
		this.name = name;
		this.id=id;
		this.designation=designation;
		System.out.println("name:"+this.name);
		System.out.println("id:"+this.id);
		System.out.println("designation:"+this.designation);
		System.out.println("deptName:"+this.deptName);
		System.out.println("doj:"+this.doj);
	}
	
	Employee(String name,int id,String designation,String doj) {
		System.out.println("Employee 4 parameter constructor");
		this.name = name;
		this.id=id;
		this.designation=designation;
		this.doj = doj;
		System.out.println("name:"+this.name);
		System.out.println("id:"+this.id);
		System.out.println("designation:"+this.designation);
		System.out.println("doj:"+this.doj);
		System.out.println("deptName:"+this.deptName);
	}
	
	private Employee(String name,int id,String designation,String doj,String deptName) {
		System.out.println("Employee 5 parameter constructor");
		this.name = name;
		this.id=id;
		this.designation=designation;
		this.doj = doj;
		this.deptName = deptName;
		System.out.println("name:"+this.name);
		System.out.println("id:"+this.id);
		System.out.println("designation:"+this.designation);
		System.out.println("doj:"+this.doj);
		System.out.println("deptName:"+this.deptName);
	}
	
	void work(String deptName) {
		System.out.println("work Depart name:"+deptName);
		// implementation.
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.work("Hr");
		System.out.println("\n");
		
		Employee e2 = new Employee("Bob", 1234,"Software developer");
		e2.work("Software");
		System.out.println("\n");
		
		Employee e3 = new Employee("Bob", 1234,"Software developer","24/01/1993");
		e3.work("QE");
		System.out.println("\n");
		
		Employee e4 = new Employee("Bob", 1234,"Software developer","24/01/1993","Software");
		e4.work("AutomationQE");
		
	}

}
