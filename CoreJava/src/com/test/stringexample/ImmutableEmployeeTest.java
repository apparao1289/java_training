package com.test.stringexample;

public class ImmutableEmployeeTest {

	public static void main(String[] args) {
		Age age = new Age(12,06,1997);
		
		ImmutableEmployee ie = new ImmutableEmployee(112,"Bob",age);
		System.out.println("id::"+ie.getId());
		System.out.println("Name::"+ie.getName());
	//	ie.getAge().setDay(24);
		System.out.println("Age:"+ie.getAge().getDay() + "-"+ie.getAge().getMonth()+"-"+ie.getAge().getYear());
		
		
		/*ImmutableEmployee ie1 = new ImmutableEmployee(232,"Ramu");
		System.out.println("id::"+ie1.getId());
		System.out.println("Name::"+ie1.getName());*/
	}

}
