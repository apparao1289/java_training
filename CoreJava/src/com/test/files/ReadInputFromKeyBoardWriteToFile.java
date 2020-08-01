package com.test.files;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadInputFromKeyBoardWriteToFile {
	public static void main(String[] args) {
		FileWriter writer = null;
		PrintWriter printWriter = null;
		InputStreamReader isReader = null;
		String target = "C:\\Apparao\\test\\output1.txt";
		try {
			writer = new FileWriter(target);
			printWriter = new PrintWriter(writer);
			// Reading input from keyboard.
			System.out.println("Enter text here:");
			isReader = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isReader);
			String line = in.readLine();
			while (!line.equals("exit")) {
				printWriter.print(line);
				line = in.readLine();
			}
		} catch (IOException e) {
			System.err.print(e.getMessage());
		} finally {
			printWriter.close();
			try {
				writer.close();
				isReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
