package com.test.interfaceexample;

public interface Employee {
	
	void getDetails(String id);
	
	default void backgroundVerification(String id) {
		System.out.println("Back ground verification for id:"+id);
	}
	
}
