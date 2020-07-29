package com.test.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<String,Integer>();
		// LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Suresh", 45);
		map.put("Ramesh", 60);
		map.put("Rajesh", 80);
		
		System.out.println("map::"+map);
		
		for(String key : map.keySet()) {
			System.out.println("key:"+key + "   value:"+map.get(key));
		}
		
	}

}
