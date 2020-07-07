package com.test.abstractexample;

public abstract class BasicMobile {

	public void searchContact() {
		System.out.println("Search contacts");
	}

	public void addContact() {
		System.out.println("Add contact");
	}

	public void deleteContact() {
		System.out.println("Delete contact");
	}

	public void call() {
		System.out.println("call ");
	}

	public abstract void capturePictures();

}
