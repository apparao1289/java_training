package com.test.multithreading;

public class CustomerAccount {

	int amount = 8000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw amount::" + amount);
		if (this.amount < amount) {
			System.out.println("Insufficient balance you have only::" + this.amount + " waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println(amount + " withdraw and current account balance is::" + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit with amount::" + amount);
		this.amount += amount;
		System.out.println(amount + " deposited and current account balance is:: " + this.amount);
		notify();
	}
}
