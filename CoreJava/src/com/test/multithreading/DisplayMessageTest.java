package com.test.multithreading;

public class DisplayMessageTest {

	public static void main(String[] args) {
		Runnable runnable = new DisplayMessage();
		
		Thread t1 = new Thread(runnable);
		t1.setName("bob");
		t1.start();
		
		Thread t2 = new Thread(runnable);
		t2.setName("tom");
		t2.start();
		
		
		Thread t3 = new Thread(runnable);
		t3.run();
	}

}
