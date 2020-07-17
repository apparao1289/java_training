package com.test.exception;

public class AccountException extends Exception {

	public AccountException(String message) {
		super(message);
	}

	public AccountException(Throwable t) {
		super(t);
	}
}
