package com.test.collections;

import java.util.HashMap;

public class LoadFactorAndCapacityExample {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>(); // default capacity of 16 and load factor is 0.75
		
		HashMap<String,String> capacityMap = new HashMap<>(20); // capacity of 20 and load factor is 0.75
		
		HashMap<String,String> capacityAndLoadMap = new HashMap<>(10,0.67f);  // capacity of 10 and load factor is 0.67
		
	}

}
