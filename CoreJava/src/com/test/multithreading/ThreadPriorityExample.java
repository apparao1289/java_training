package com.test.multithreading;

public class ThreadPriorityExample {

	public static void main(String[] args) {
		
		PrintMessage t1 = new PrintMessage();
		t1.setName("t1");
		t1.setPriority(9);
		t1.start();
		
		PrintMessage t2 = new PrintMessage();
		t2.setName("t2");
		t2.setPriority(8);
		t2.start();
		
	}

}
