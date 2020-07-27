package com.test.collections;

public class Employee implements Comparable<Employee> {

	private Integer id;

	private String firstName;

	private String lastName;

	private Double salary;

	private String designation;

	public Employee(Integer id, String firstName, String lastName, Double salary, String designation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.designation = designation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int compareTo(Employee emp) {
		
		// Sorting salary field in ascending order.
		if (salary > emp.salary) {
			return 1;
		} else if (salary < emp.salary) {
			return -1;
		} else {
			return 0;
		}
		
		// Sorting salary field in decending order.
		/*if (salary < emp.salary) {
			return 1;
		} else if (salary > emp.salary) {
			return -1;
		} else {
			return 0;
		}*/
		
		// sorting based on string type
		//return firstName.compareTo(emp.firstName);
		
		// sorting based on INteger field.
		/*if (id > emp.id) {
			return 1;
		} else if (id < emp.id) {
			return -1;
		} else {
			return 0;
		}*/

	}

}
