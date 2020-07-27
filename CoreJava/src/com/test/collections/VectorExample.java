package com.test.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("India");
		vector.add("US");
		vector.add("UK");
		vector.add("Netherlands");
		vector.add("Canada");
		
		System.out.println("Check vector is empty::"+vector.isEmpty());
		System.out.println("size::"+vector.size());
		
		// Access elements using Iterator interface.
		System.out.println("Vector elements******************");
		Iterator<String> it = vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
