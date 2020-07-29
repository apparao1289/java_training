package com.test.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<>();
		map.put("Suresh", "New York");
		map.put("Ramesh", "Atlanta");
		map.put("Tom", "Miami");
		map.put("Bob", "New Jersey");
		
		System.out.println("map::"+map);
		
		for(String key : map.keySet()) {
			System.out.println("Name:"+key + "   Living city::"+map.get(key));
		}
		
		
		// reverse order of keys
		Map<String,String> reverseMap = new TreeMap<String,String>(new KeyComparator());
		reverseMap.put("Suresh", "New York");
		reverseMap.put("Ramesh", "Atlanta");
		reverseMap.put("Tom", "Miami");
		reverseMap.put("Bob", "New Jersey");
		System.out.println("reverseMap::"+reverseMap);
		
		System.out.println("reverse order of keys::");
		for(String key : reverseMap.keySet()) {
			System.out.println("Name:"+key + "   Living city::"+reverseMap.get(key));
		}
	}

}
