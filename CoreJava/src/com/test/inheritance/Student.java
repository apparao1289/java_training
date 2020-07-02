package com.test.inheritance;

public class Student extends Person {
	
	public String rollNumber;

	public Student() {
		System.out.println("Student default constructors.");
	}
	
	public Student(String ssn,String rollNumber) {
		super(ssn);
		this.rollNumber = rollNumber;
		System.out.println("Inside constructor of Student rollnumber::"+this.rollNumber);
	}
	
	public void displayStudentDetails() {
		super.displaySsn();
		System.out.println("Address::"+super.address);
		System.out.println("Displaying roll number::"+this.rollNumber);
	}
	
	public static void main(String[] args) {
		// parent class object
		//Person p = new Person();
		
		//System.out.println("creating sub class object.....");
		// creating child class object
		//Student s = new Student();
		
		Student s1 = new Student("S12345","0000122");
		s1.displayStudentDetails();
		
	}

}
