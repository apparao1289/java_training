package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>(); // create a set with default capacity of 10 and load factor 0.75
		HashSet<String> hashSetWithCapacity = new HashSet<>(10); // create a set with default capacity of 10 and load factor 0.75
		HashSet<String> hashSetWithCapacityAndLoadFacot = new HashSet<>(10,0.65f); // create a set with default capacity of 10 and load factor 0.75
		Set<String> set = new HashSet<>(); // create a set with default capacity of 16 and load factor 0.75
		// Add element to set
		set.add("Hyderabad");
		set.add("Bangalore");
		set.add("Mumbai");
		set.add("Hyderabad");
		set.add("Vizag");
		
		System.out.println("set::"+set);
		
		// Remove element from set.
		set.remove("Hyderabad");
		System.out.println("set::"+set);
		
		// Print the values
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// How to convert ArrayList to HashSet.
		ArrayList<String> list = new ArrayList<>();
		list.add("Ramu");
		list.add("Tom");
		list.add("Bob");
		list.add("Tom");
		System.out.println("list::"+list);
		List<String> filtedNameList = removeDuplicateValuesFromList(list);
		System.out.println("name list:"+filtedNameList);
		
		List<String> nameList = removeDuplicateValuesFromListUsingForLoop(list);
		System.out.println("nameList::"+nameList);
		
		// to check set is empty
		System.out.println("is empty::"+set.isEmpty());
	}

	private static List<String> removeDuplicateValuesFromList(ArrayList<String> list) {
		Set<String> nameSet = null;
		if (null != list && !list.isEmpty()) {
			nameSet = new HashSet<>(list);
		}
		return new ArrayList<String>(nameSet);
	}
	
	private static List<String> removeDuplicateValuesFromListUsingForLoop(ArrayList<String> list) {
		Set<String> nameSet = new HashSet<>();
		if (null != list && !list.isEmpty()) {
			for(String name : list) {
				nameSet.add(name);
			}
		}
		return new ArrayList<String>(nameSet);
	}

}
