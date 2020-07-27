package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringsSorting {

	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("New York");
		cityList.add("New Jersey");
		cityList.add("Atlanta");
		cityList.add("Miami");
		
		System.out.println("City list::"+cityList);
		
		// Sorting the ArrayList.
		sortArrayListInAscendingOrder(cityList);
		
		sortArrayListInReverseOrder(cityList);
		
	}

	private static void sortArrayListInReverseOrder(List<String> cityList) {
		System.out.println("Printing strings in reverse order:::");
		Collections.sort(cityList, Collections.reverseOrder());
		for(String city : cityList) {
			System.out.println(city);
		}
	}

	private static void sortArrayListInAscendingOrder(List<String> cityList) {
		Collections.sort(cityList); // sorting in natural order 
		for(String city : cityList) {
			System.out.println(city);
		}
	}

}
