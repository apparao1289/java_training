package com.test.multithreading;

public class ThreadException extends Thread{
	
	public void run() {
		Thread.currentThread().setUncaughtExceptionHandler(new ThreadExceptionHandler());
		System.out.println(Integer.parseInt("777"));
		System.out.println(Integer.parseInt("888"));
		System.out.println(Integer.parseInt("abc"));
		System.out.println(Integer.parseInt("999"));
	}
}
