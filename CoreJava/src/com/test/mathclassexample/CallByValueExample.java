package com.test.mathclassexample;

public class CallByValueExample {

	int a = 20;

	void change(CallByValueExample call) {
		call.a = call.a + 100;// changes will be in the instance variable
	}

	public static void main(String args[]) {
		CallByValueExample cvt = new CallByValueExample();
		System.out.println("before change() invocation :" + cvt.a);
		cvt.change(cvt);// passing object
		System.out.println("after change() invocation :" + cvt.a);
	}

}
