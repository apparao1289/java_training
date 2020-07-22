package com.test.multithreading;

public class DisplayMessage implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread name:"+Thread.currentThread().getName());
		System.out.println("Thread Id:"+Thread.currentThread().getId());
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());
		System.out.println("Displaying the message..");
	}

}
