package com.test.files;

import java.io.File;

public class ReadFilesFromFolder {

	public static void main(String[] args) {
		File file = new File("C:\\Apparao\\webservices_documents");
		String[] list = file.list();
		for (String name : list) {
			System.out.println(name);
		}
	}

}
