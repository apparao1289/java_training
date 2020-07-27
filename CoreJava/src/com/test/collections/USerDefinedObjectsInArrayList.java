package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class USerDefinedObjectsInArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(111,"Bob","P",3000.0,"Software Developer");
		empList.add(e1);
		empList.add(new Employee(112,"Tom","T",5000.0,"Software Manager"));
		
		System.out.println("emp list size:"+empList.size());
		System.out.println("Is list is empty::"+empList.isEmpty());
		
		// Fetching the empolyee object by specified index.
		Employee e = empList.get(1);
		System.out.println("Id:"+e.getId());
		System.out.println("First name::"+e.getFirstName());
		System.out.println("Last name::"+e.getLastName());
		System.out.println("Salary:"+e.getSalary());
		System.out.println("Designation:"+e.getDesignation());
		
		// Print the all objects available in given list using extended for loop.
		printEmployeesUsingExtendedForLoop(empList);
		
		// Print the list values using normal for loop
		printEmployeesUsingForLoop(empList);
		
		// print the list values using Iterator
		printEmployeesUsingIterator(empList);
		
	}

	private static void printEmployeesUsingExtendedForLoop(ArrayList<Employee> empList) {
		if(empList != null && !empList.isEmpty()) {
			for(Employee emp : empList) {
				System.out.println("Employee details::::::::::::::::::::::");
				System.out.println("Id:"+emp.getId());
				System.out.println("First name::"+emp.getFirstName());
				System.out.println("Last name::"+emp.getLastName());
				System.out.println("Salary:"+emp.getSalary());
				System.out.println("Designation:"+emp.getDesignation());
			}
		}
	}
	
	private static void printEmployeesUsingIterator(ArrayList<Employee> empList) {
		System.out.println("Printing ArrayList elements using Iterator ######################");
		if(empList != null) {
			Iterator<Employee> it = empList.iterator();
			while(it.hasNext()) {
				Employee e = it.next();
				System.out.println("Printing employee object using Iterator interface");
				System.out.println("Id:"+e.getId());
				System.out.println("First name::"+e.getFirstName());
				System.out.println("Last name::"+e.getLastName());
				System.out.println("Salary:"+e.getSalary());
				System.out.println("Designation:"+e.getDesignation());
			}
		} else {
			System.out.println("List is null");
		}
	}

	public static void printEmployeesUsingForLoop(ArrayList<Employee> empList) {
		System.out.println("Printing ArrayList elements using for loop *****************************");
		if (null != empList) {
			for (int index = 0; index < empList.size(); index++) {
				Employee e = empList.get(index);
				System.out.println("Printing employee object using normal for loop");
				System.out.println("Id:"+e.getId());
				System.out.println("First name::"+e.getFirstName());
				System.out.println("Last name::"+e.getLastName());
				System.out.println("Salary:"+e.getSalary());
				System.out.println("Designation:"+e.getDesignation());
			}
		} else {
			System.out.println("List is null");
		}
	}
	

}
