package com.test.objectclass;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("12", "timberland gap pooler", "miami", "FL", "30003");
		Student s1 = new Student(111, "Bob", "2019",address);
		
		Student s2 = (Student)s1.clone();
		
		s2.getAddress().setCity("Atlanta");
		
		System.out.println("id:"+s2.getId());
		System.out.println("name::"+s2.getName());
		System.out.println("batch:"+s2.getBatch());
		System.out.println("s2 city::"+s2.getAddress().getCity());
		
		System.out.println("s1 city ::"+s1.getAddress().getCity());
		
	}

}
