package com.test.files;

import java.io.DataInputStream;
import java.io.IOException;

public class ReadDataFromKeyBoardAndWriteToConsole {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the value::");
		String s = dis.readLine();
		
		System.out.println(s);
	}

}
