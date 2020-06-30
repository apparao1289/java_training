package com.test.encapsulation;

public class TestEncasulation {

	public static void main(String[] args) {
		Employee e = new Employee();
		//e.name = "Bob";  //  private numbers can access out side the class.
		
		e.setName("Bob");
		System.out.println("Name::"+e.getName());
		
		e.setSalary(3000, "ADMIN");
		System.out.println("Salary:"+e.getSalary("MANAGER"));
		System.out.println("Salary:"+e.getSalary("ADMIN"));
		
		
		Employee e1 = new Employee();
		e1.setName("");
		System.out.println("e1 Name::"+e1.getName());
		
		e1.setSalary(3000, "MANAGER");
		System.out.println("e1 Salary:"+e1.getSalary("ADMIN"));
		
		
	}

}
