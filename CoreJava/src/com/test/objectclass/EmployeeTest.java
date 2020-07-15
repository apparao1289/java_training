package com.test.objectclass;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("123", "Bob", "jhon", 30000);
		Employee e2 = new Employee("234", "Bob", "P", 30000);
		
		int e1hasCode = e1.hashCode();
		int e2hashcode = e2.hashCode();
		if(e1hasCode == e2hashcode) {
			System.out.println("Both objects are may equal and invoking the equal method");
			
			if(e1.equals(e2)) {
				System.out.println("Both objects are equals..");
			} else {
				System.out.println("Both objects are not equals..");
			}
		} else {
			System.out.println("Both objects are not equls..");
		}
		
		// getClass() method
		displayClassName(e1);
		
		// toString() method
		System.out.println("e1 object::"+e1.toString());
		
		e1 = null;
		// finalized method.
		System.gc();
		
	}

	private static void displayClassName(Employee e) {
		System.out.println("Class name::"+e.getClass());
	}

}
