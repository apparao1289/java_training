package com.test.exception;

public class BreakWithFinallyBlockExample {

	public static void main(String[] args) {
		int a[] = {2,3,4,6};
		System.out.println("result::"+arrayOperations(a));
	}

	public static  int arrayOperations(int a[]) {
		int result = 0;
		try {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 6) {
					result = 6;
					break;
				}
			}
		} catch (Exception e) {
			result = 7;
		} finally {
			result = 8;
		}
		
		return result;
	}

}
