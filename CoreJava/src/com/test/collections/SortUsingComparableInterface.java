package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingComparableInterface {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		Employee e1 = new Employee(123, "Bob", "P", 5000.0, "Software Engineer");
		empList.add(e1);
		empList.add(new Employee(222, "Tom", "B", 2000.0, "Software Developer"));
		empList.add(new Employee(331, "Ramu", "T", 8000.0, "Software Manager"));
		empList.add(new Employee(112, "Suresh", "G", 1000.0, "Quality Engineer"));
		
		System.out.println("Before sorting employee list::::");
		for(Employee e : empList) {
			System.out.println(e.getId() + "   "+e.getFirstName() +"  "+e.getLastName() +"  "+e.getSalary() + "  "+e.getDesignation());
		}
		
		sortingOfEmployee(empList);
	}

	private static void sortingOfEmployee(List<Employee> empList) {
		Collections.sort(empList);
		System.out.println("After sorting");
		for(Employee e : empList) {
			System.out.println(e.getId() + "   "+e.getFirstName() +"  "+e.getLastName() +"  "+e.getSalary() + "  "+e.getDesignation());
		}
	}

}
