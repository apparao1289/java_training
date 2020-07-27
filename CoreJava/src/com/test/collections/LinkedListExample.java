package com.test.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Hyderabad");
		linkedList.add("Bangalore");
		linkedList.add("Chennai");
		System.out.println("list::"+linkedList);
		linkedList.add(2, "Vizag");
		System.out.println("After adding Vizag to list::"+linkedList);
		
		System.out.println("Empty or not:"+linkedList.isEmpty());
		System.out.println("size:"+linkedList.size());
		System.out.println("2nd index value::"+linkedList.get(2));
		
		// printing linked list values.
		for(String city: linkedList) {
			System.out.println(city);
		}
		
		linkedList.remove(0);
		System.out.println("final list::"+linkedList);
		
		Collections.sort(linkedList);
		System.out.println("Sorted list:"+linkedList);
	}

}
