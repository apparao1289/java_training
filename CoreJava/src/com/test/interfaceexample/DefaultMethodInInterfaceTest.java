package com.test.interfaceexample;

public class DefaultMethodInInterfaceTest {

	public static void main(String[] args) {
		Employee e = new EmployeeImpl();
		e.backgroundVerification("123");
		e.getDetails("123");
		
	}

}
