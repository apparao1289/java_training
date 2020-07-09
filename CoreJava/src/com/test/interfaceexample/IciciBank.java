package com.test.interfaceexample;

public class IciciBank implements Bank {

	@Override
	public void registration(String name, String address, String ssn) {
		System.out.println("Registration done successfully");
	}

	@Override
	public void deposit(int amount) {
		System.out.println("deposited amount:" + amount);
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdraw amount:" + amount);
	}

	@Override
	public void fixedDeposit(String name, int amount, int rateofInteresr) {
		System.out.println("Fixed deposit process is completed for amount: " + amount);
	}
	
	public void dmatAccount(String name) {
		System.out.println("Dmat account is opened");
	}
	
	public static void main(String args[]) {
		IciciBank ic = new IciciBank();  // Using class reference variable, we can invoke all members of class ( interface methods and non interface methods)
		ic.registration("Bob", "Miami FL", "42356");
		ic.deposit(3000);
		ic.withdraw(2000);
		ic.fixedDeposit("Bob", 1000, 6);
		ic.dmatAccount("Bob");
		//ic.rateofInterest;
		
		Bank b = new IciciBank();  // Using interface reference variable, we can invoke all methods of interface. we cann't invoke the non interface methods.
		b.registration("Ramu", "Miami FL", "23244");
		b.deposit(5000);
		b.withdraw(2000);
		b.fixedDeposit("Ramu", 1000, 6);
		//b.dmatAccount("Ramu");
		System.out.println("Rate of interest:"+b.rateofInterest);
		System.out.println("Rate of interest:"+Bank.rateofInterest);
		
		
	}

}
