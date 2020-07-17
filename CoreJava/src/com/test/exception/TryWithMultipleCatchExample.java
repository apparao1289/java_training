package com.test.exception;

public class TryWithMultipleCatchExample {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 6 };
		int n = 0;
		System.out.println("result:: "+arrayOperation(a,n));
		//System.out.println("result:: "+arrayOperation(a,n));
	}

	public static int arrayOperation(int a[],int n) {
		int sum = 0;
		try {
			for (int i = 0; i <a.length; i++) {
				if (a[i] % n == 0) {
					sum = sum + a[i];
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array out of bound::"+e);
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic exception::"+e);
		}
		
		return sum;
	}

	
	public static int arrayOperation1(int a[],int n) {
		int sum = 0;
		try {
			for (int i = 0; i <a.length; i++) {
				if (a[i] % n == 0) {
					sum = sum + a[i];
				}
			}
		} catch (Exception e) {
			System.err.println("Exception occurred while doing the array operations::"+e);
		}
		
		return sum;
	}
}
