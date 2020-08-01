package com.test.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// readFileUsingScanner();
		readInputFromKeyBoard();
	}

	private static void readFileUsingScanner() throws FileNotFoundException, IOException {
		FileReader reader = null;
		Scanner sc = null;
		try {
			reader = new FileReader("C:\\Apparao\\test\\input.txt");
			sc = new Scanner(reader);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}

		} finally {
			if (null != reader)
				reader.close();
			if (sc != null)
				sc.close();
		}

	}

	private static void readInputFromKeyBoard() throws IOException {
		FileWriter fw = null;
		Scanner in = null;
		try {
			fw = new FileWriter("C:\\Apparao\\test\\output2.txt");
			in = new Scanner(System.in);
			System.out.print("Enter your address: ");
			while (in.hasNext()) {
				String name = in.nextLine();
				if(name.equals("exit")) {
					break;
				}
				fw.write(name);
				
			}
		} finally {
			if (in != null)
				in.close();
			if (fw != null) {
				fw.close();
			}
		}
	}
}
