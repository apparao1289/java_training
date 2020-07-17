package com.test.exception;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new AccountImpl();

		try {
			boolean status = account.deposit("23456789", 100);
			if (status) {
				System.out.println("Amount deposit successfully");
			} else {
				System.out.println("Amount not deposit due some issue");
			}

		} catch (AccountException e) {
			e.printStackTrace();
		}
		System.out.println("End of the deposit process.");

		int balance;
		try {
			balance = account.withdraw("23456789", 200);
			System.out.println("Your account balance:" + balance);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
