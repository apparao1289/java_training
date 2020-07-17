package com.test.exception;

public interface Account {
	
	boolean deposit(String accountId,int depositAmount) throws AccountException;
	
	int withdraw(String accountId,int withdrawAmount) throws AccountException;

}
