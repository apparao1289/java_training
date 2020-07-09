package com.test.interfaceexample;

public class StudentImpl implements Student {

	@Override
	public void getDetails(String id) {
		System.out.println("Student details for given id::"+id);
	}
	
	static void getStudentRemarks(String id) {
		System.out.println("Student Remarks for student id::"+id);
	}
}
