package com.test.loops;

public class PrintNuturalNumber {

	public static void main(String[] args) {
		printNumber(20);
	}

	public static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {   // 1.initilization 2 condition checking 3. execuet statements 4. evaluate condition 
			System.out.println(i);
		}
	}

}
