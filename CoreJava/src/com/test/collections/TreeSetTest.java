package com.test.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String args[]) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ramu");
		al.add("Surya");
		al.add("Balu");
		al.add("Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Reverse of the elements available in set
		System.out.println("Print the elements in reverse order::");
		TreeSet<String> set = new TreeSet<>(new NameComparator());
		set.add("Ramu");
		set.add("Surya");
		set.add("Balu");
		set.add("Ajay");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
