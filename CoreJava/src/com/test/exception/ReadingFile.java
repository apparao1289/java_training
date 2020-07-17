package com.test.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		String filePath = "C:\\Apparao\\test.txt";
		readFileContent(filePath);
		try {
			readFile(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private static void readFileContent(String filePath) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();

				if (line == null) {
					break;
				}
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void readFile(String filePath) throws IOException {
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			String line = br.readLine();

			if (line == null) {
				break;
			}
			System.out.println(line);
		}

	}
}
