package com.test.multithreading;

public class PrintMessage extends Thread {
	
	@Override
	public void run() {
		System.out.println("Executing thread:: "+Thread.currentThread().getName());
		System.out.println("Thread Id:"+Thread.currentThread().getId());
		System.out.println("THread priority:"+Thread.currentThread().getPriority());
		System.out.println("Hell how are you..");
		System.out.println("Ending the "+Thread.currentThread().getName() +" thread process");
	}
}
