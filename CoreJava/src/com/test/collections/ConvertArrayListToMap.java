package com.test.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertArrayListToMap {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(123, "Bob", "P", 5000.0, "Software Engineer");
		empList.add(e1);
		empList.add(new Employee(222, "Tom", "B", 2000.0, "Software Developer"));
		empList.add(new Employee(331, "Ramu", "T", 8000.0, "Software Engineer"));
		empList.add(new Employee(112, "Suresh", "G", 1000.0, "Quality Engineer"));
		empList.add(new Employee(112, "Raja", "P", 3000.0, "Quality Engineer"));

		HashMap<String, List<Employee>> desigMap = convertListToMap(empList);
		System.out.println("Printing hash map values");
		Set<Entry<String, List<Employee>>> set = desigMap.entrySet();
		for (Map.Entry<String, List<Employee>> entry : set) {
			System.out.println("Designation ::" + entry.getKey());
			System.out.println("List of employee::");
			printValue(entry.getValue());
		}

	}

	private static void printValue(List<Employee> list) {
		if (null != list && !list.isEmpty()) {
			for (Employee emp : list) {
				System.out.println("Id:" + emp.getId());
				System.out.println("first name:" + emp.getFirstName());
				System.out.println("last name:" + emp.getLastName());
				System.out.println("salary:" + emp.getSalary());
				System.out.println("Designation:" + emp.getDesignation());

			}
		}
	}

	private static HashMap<String, List<Employee>> convertListToMap(List<Employee> empList) {
		HashMap<String, List<Employee>> desigMap = new HashMap<>();
		if (null != empList && !empList.isEmpty()) {
			for (Employee emp : empList) {
				if (desigMap.containsKey(emp.getDesignation())) {
					List<Employee> availableEmpList = desigMap.get(emp.getDesignation());
					availableEmpList.add(emp);
					desigMap.put(emp.getDesignation(), availableEmpList);

				} else {
					List<Employee> list = new ArrayList<>();
					list.add(emp);
					desigMap.put(emp.getDesignation(), list);
				}
			}
		}
		return desigMap;
	}

}
