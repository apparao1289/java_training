package com.test.files;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		File file = new File("C:\\Apparao\\test1");
		file.mkdir();
		System.out.println("Directory is created..");
	}

}
