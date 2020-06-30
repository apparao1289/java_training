package com.test.encapsulation;

public class Employee {

	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.isEmpty()) {
		   this.name = name;
		}
	}

	public double getSalary(String role) {
		if("MANAGER".equals(role)) {
		    return salary;
		}
		return 0.0;
	}

	public void setSalary(double salary,String role) {
		if("ADMIN".equals(role)) {
		   this.salary = salary;
		}
	}

}
