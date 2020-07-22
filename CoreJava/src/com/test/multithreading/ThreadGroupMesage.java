package com.test.multithreading;

public class ThreadGroupMesage implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Name ::" + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+"  Thread executing Run method ..");
	}

}
