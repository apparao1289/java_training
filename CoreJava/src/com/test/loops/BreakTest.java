package com.test.loops;

public class BreakTest {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			System.out.println(i);
			i++;
			if (i > 3) {
				break;
			}
		}
	}
}
