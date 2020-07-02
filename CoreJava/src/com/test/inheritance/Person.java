package com.test.inheritance;

public class Person {

	private String ssn;
	
	public String address;

	public Person() {
		System.out.println("Person default constructor");
	}

	public Person(String ssn) {
		this.ssn = ssn;
		System.out.println("Inside constructor of person ssn::"+this.ssn);
	}
	
	public void displaySsn() {
		System.out.println("Displaying ssn:"+this.ssn);
	}
}
