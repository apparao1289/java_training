package com.test.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationExample {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee("121", "Tom", "123 timberland gap pooler Atlanta GA 3003", 5000.0);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("C:\\Apparao\\test\\employee.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
		} finally {
			if (null != fos) {
				fos.close();
			}
			if (oos != null) {
				fos.close();
			}
		}
	}

}
