package com.test.accessmodifiers;

public class Employee {

	private String name;
	private static double salary = 30000;

	public void displayEmployeeDetails() {
		System.out.println("Employee details..");
	}

	public static void printEmployeeDetails() {
		System.out.println("Printing employee details");
	}

	public static void main(String[] args) {
		// Instance variable and methods access through object reference.
		Employee e = new Employee();
		System.out.println("Name::" + e.name);
		e.displayEmployeeDetails();
		
		// static variable and static methods can access through Class name.
		System.out.println("salary::" + Employee.salary);
		Employee.printEmployeeDetails();

	}

}
