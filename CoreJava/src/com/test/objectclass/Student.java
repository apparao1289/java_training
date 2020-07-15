package com.test.objectclass;

public class Student implements Cloneable {

	private int id;

	private String name;

	private String batch;

	private Address address;

	public Student(int id, String name, String batch, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student student = (Student) super.clone();
		student.address = (Address) address.clone();
		return student;

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
