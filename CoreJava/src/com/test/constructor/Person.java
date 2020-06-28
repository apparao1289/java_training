package com.test.constructor;

public class Person {
	
	public String name;
	
	protected String dob;
	
	private double salary;

	public Person() {
		System.out.println("Default constructor..");
	}
	public Person(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	
	public static void main(String args[]) {
		Person p = new Person();
		System.out.println("name:"+p.name);
		System.out.println("dob:"+p.dob);
		System.out.println("salary::"+p.salary);
	}
	

}
