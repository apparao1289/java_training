package com.test.multithreading;

public class ThreadSleepExample extends Thread {

	@Override
	public void run() {
		System.out.println("Thread name::" + Thread.currentThread().getName());
		System.out.println("Invoking the orders system ..");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("We got the Orders from order systems ");
	}

	public void run(String message) {
		System.out.println("Over loading the run is possible, but jvm will not call the overl loaded run method::"
				+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadSleepExample tse = new ThreadSleepExample();
		tse.start();
		tse.run("over loading test");

	}

}
