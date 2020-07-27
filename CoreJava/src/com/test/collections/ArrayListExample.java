package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		// Adding element to ArrayList
		al.add("Tom");
		al.add(3);
		al.add(4.5);
		al.add(true);
		al.add(30);

		System.out.println("list::" + al);
		System.out.println("lis is empty::" + al.isEmpty());
		System.out.println("size::" + al.size());

		al.add(34);
		al.add(456);
		al.add("New York");
		al.add("Atlanta");
		al.add("FL");
		al.add("MIami");
		al.add("AK");

		System.out.println("list::" + al);
		System.out.println("size::" + al.size());

		// get the single element.
		System.out.println("zero' th index value:" + al.get(0));

		// Printing all elements using Normal for loop
		printElementsUsingForLoop(al);

		// Printing the element using extended for loop.
		printElementsUsingIterator(al);
		
		// delete element from ArrayList
		System.out.println("Before remove operation::"+al);
		al.remove(5);
		System.out.println("After remove operation::"+al);
		
		al.clear();
		System.out.println("After clear operation::"+al);
		
		ArrayList list  = new ArrayList(20); // it will allocate the space for 20 elements.
		list.add("Ram");
		System.out.println("size::"+list.size());

	}

	private static void printElementsUsingIterator(ArrayList al) {
		System.out.println("Printing ArrayList elements using Iterator");
		if(al != null) {
			Iterator it = al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		} else {
			System.out.println("List is null");
		}
	}

	public static void printElementsUsingForLoop(ArrayList list) {
		System.out.println("Printing ArrayList elements using for loop");
		if (null != list) {
			for (int index = 0; index < list.size(); index++) {
				System.out.println(list.get(index));
			}
		} else {
			System.out.println("List is null");
		}
	}

}
