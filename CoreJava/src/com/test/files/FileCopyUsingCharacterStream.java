package com.test.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUsingCharacterStream {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\Apparao\\test\\input-name.txt");
			fw = new FileWriter("C:\\Apparao\\test\\output-name.txt");
			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
			System.out.println("File copy is successfull");
		} finally {
			if (fr != null) {
				fr.close();
			}
			if (fw != null) {
				fw.close();
			}
		}
	}

}
