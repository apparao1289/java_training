package com.test.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Apparao\\test\\employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee)ois.readObject();
		System.out.println("id:"+e.getId());
		System.out.println("name::"+e.getName());
		System.out.println("address::"+e.getAddress());
		System.out.println("salary::"+e.getSalary());
	}

}
