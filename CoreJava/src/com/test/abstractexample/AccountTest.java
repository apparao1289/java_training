package com.test.abstractexample;

public class AccountTest {

	public static void main(String[] args) {
		Account a= new SavingAccount();
		a.registration();
		a.deposit(3000);
		a.withdraw(2000);
		
		Account ac = new CurrentAccount();
		ac.registration();
		ac.deposit(4000);
		ac.withdraw(1000);
		
		CurrentAccount ca = new CurrentAccount();
		ca.registration();
		ca.deposit(2000);
		ca.withdraw(500);
		ca.fixedDeposit(10000, 6);
	}

	
}
