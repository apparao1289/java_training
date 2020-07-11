package com.test.stringexample;

public class AdditionOfTwoBinaryStrings {

	public static void main(String[] args) {
		System.out.println(addTwoBinaryNUmbers("100", "111"));
	}

	private static String addTwoBinaryNUmbers(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		int carry = 0;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = c1.length - 1; i >= 0; i--) {
			sum = Integer.parseInt(String.valueOf(c1[i])) + Integer.parseInt(String.valueOf(c2[i]));
			sum = sum + carry;
			if (sum == 3) {
				sb.append(1);
				carry = 1;
			} else if (sum == 2) {
				sb.append(0);
				carry = 1;
			} else {
				sb.append(sum);
				carry = 0;
			}
			if (i == 0 && carry == 1) {
				sb.append(carry);
			}
		}
		return sb.reverse().toString();
	}

}
