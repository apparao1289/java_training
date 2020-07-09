package com.test.interfaceexample;

public class StaticMethodInInterfaceTest {

	public static void main(String[] args) {
		Student s = new StudentImpl();
		s.getDetails("222");
		//s.getStudentRemarks("222");
		
		Student.getStudentRemarks("222");
	}

}
