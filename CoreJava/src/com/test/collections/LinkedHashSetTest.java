package com.test.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Hyderabad");
		set.add("Bangalore");
		set.add("Hyderabad");
		set.add("Mumbai");
		set.add("Delhi");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		// Synchronized the set
		Collections.synchronizedSet(set);
		
		// Immutable set
		Set<String> immutabeSet = Collections.unmodifiableSet(set);
		immutabeSet.add("Chennai");
	}
}
