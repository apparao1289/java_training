package com.test.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:\\Apparao\\test\\input.txt");
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			if (fr != null) {
				fr.close();
			}
			if (br != null) {
				br.close();
			}
		}
	}

}
