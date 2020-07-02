package com.test.inheritance;

public class PolicDog extends Dog {
	
	public void smellIdentification() {
		System.out.println("smell identification");
	}

	public static void main(String[] args) {
		
		PolicDog pd = new PolicDog();
		pd.eat();
		pd.run();
		pd.smellIdentification();
	}

}
