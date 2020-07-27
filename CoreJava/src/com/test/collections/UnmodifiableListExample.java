package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListExample {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("Miami");
		cityList.add("Atlanta");
		cityList.add("New York");
		cityList.add("New Jersey");

		// Sort the city list
		List<String> sortedList = sortCityList(cityList);
		//sortedList.add("Dallas");
		for(String city : sortedList) {
			System.out.println(city);
		}
	}

	private static List<String> sortCityList(List<String> cityList) {
		Collections.sort(cityList);
		List<String> list = Collections.unmodifiableList(cityList);
		return list;
	}

}
