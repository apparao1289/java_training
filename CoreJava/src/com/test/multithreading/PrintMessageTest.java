package com.test.multithreading;

public class PrintMessageTest {

	public static void main(String[] args) {
		System.out.println("Thread Name::" + Thread.currentThread().getName());
		System.out.println("Thread Id:"+Thread.currentThread().getId());

		PrintMessage t1 = new PrintMessage();
		t1.setName("t1");
		t1.start();
		
		PrintMessage t2 = new PrintMessage();
		t2.setName("t2");
		t2.start();
		
		PrintMessage t3 = new PrintMessage();
		t3.run();
		
		System.out.println("Thread Name::" + Thread.currentThread().getName() +" ends ");
	}

}
