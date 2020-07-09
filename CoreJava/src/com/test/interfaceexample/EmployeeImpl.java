package com.test.interfaceexample;

public class EmployeeImpl implements Employee {

	@Override
	public void getDetails(String id) {
		System.out.println("Employee details for given id::"+id);
	}
	
	public void backgroundVerification(String id) {
		System.out.println("Employee back ground verification for id::"+id);
	}

}
