package com.test.files;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		
		File file = new File("C:\\Apparao\\test.txt");
		
		// check it is file or directory
		if(file.isFile()) {
			System.out.println("It is file");
		}
		
		if(file.isDirectory()) {
			System.out.println("It is directory");
		} else {
			System.out.println("It is not a directory");
		}
		
		// File name
		System.out.println("File Name::"+file.getName());
		
		System.out.println("Space::"+file.getTotalSpace());
		
		System.out.println("Used space::"+file.getUsableSpace());
		
		System.out.println("Absolute path::"+file.getAbsolutePath());
		
		System.out.println("read permission:"+file.canRead());
		
		System.out.println("write permission:"+file.canWrite());
		
		System.out.println("execute permission:"+file.canExecute());
		
	}

}
