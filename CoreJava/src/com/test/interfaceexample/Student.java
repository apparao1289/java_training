package com.test.interfaceexample;

public interface Student {
	
	void getDetails(String id);
	
	static void getStudentRemarks(String id) {
		System.out.println("Remarks for student::"+id);
	}
}
