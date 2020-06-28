package com.test.constructor;

public class Student {
	
	String name;
	String rollNumber;
	String dob;
	String doj;
	
	public Student() {
		System.out.println("Default constructor..");
	}
	
	public Student(String name,String rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		System.out.println("name::"+this.name);
		System.out.println("roll number:"+this.rollNumber);
	}
	
	void read() {
		System.out.println("Read ..");
	}
	
	void write() {
		System.out.println("Write");
	}
	
	void play() {
		System.out.println("Play");
	}

	public static void main(String[] args) {
		//Student s1 = new Student("Bob","1245");
		Student s1 = new Student();
		System.out.println("name:"+s1.name);
		System.out.println("rollNumber:"+s1.rollNumber);
		System.out.println("dob:"+s1.dob);
		System.out.println("doj:"+s1.doj);
	}

}
