package com.test.multithreading;

public class ThreadJoinExample extends Thread {
	@Override
	public void run() {
		System.out.println("Thread name::" + Thread.currentThread().getName());
		System.out.println("run method is executing..");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread is started.");

		ThreadJoinExample tj = new ThreadJoinExample();
		tj.start();

		tj.join();

		System.out.println("Main Thread is ending.");
	}

}
