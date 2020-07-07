package com.test.abstractexample;

public class SmartPhone extends BasicMobile {

	@Override
	public void capturePictures() {
		System.out.println("captureing the pictures...");
	}

	public static void main(String[] args) {

		BasicMobile bm = new SmartPhone();
		bm.addContact();
		bm.deleteContact();
		bm.searchContact();
		bm.capturePictures();
	}

}
