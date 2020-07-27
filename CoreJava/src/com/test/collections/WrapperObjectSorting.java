package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapperObjectSorting {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(1);
		list.add(80);
		list.add(3);
		list.add(800);
		
		// sort the list in ascending order.
		Collections.sort(list);
		for(Integer number : list) {
			System.out.println(number);
		}
		
		// sort the list in reverse order.
		System.out.println("Printing list elementrs in reverse order::");
		Collections.sort(list,Collections.reverseOrder());
		for(Integer num : list) {
			System.out.println(num);
		}
	}

}
