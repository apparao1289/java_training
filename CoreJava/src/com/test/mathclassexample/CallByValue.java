package com.test.mathclassexample;

public class CallByValue {

	int a = 10;

	void change(int a) {
		a = a + 50;
	}

	public static void main(String args[]) {
		CallByValue cv = new CallByValue();
		System.out.println("before change() invocation :" + cv.a);
		cv.change(500);
		System.out.println("after change() invocation " + cv.a);
	}

}
