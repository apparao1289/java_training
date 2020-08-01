package com.test.files;

import java.io.File;

public class DisplayOnlyFilesFromDirectory {

	public static void main(String[] args) {
		File file = new File("C:\\Apparao\\webservices_documents");
		String[] list = file.list();
		for (String name : list) {
			File f = new File("C:\\\\Apparao\\\\webservices_documents", name);
			if (f.isFile()) {
				System.out.println(name);
			}
		}
	}

}
