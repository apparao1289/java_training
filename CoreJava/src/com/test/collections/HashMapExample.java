package com.test.collections;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String args[]) {
		HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
		// Adding key and value to HashMap
		scoreMap.put("Bob", 60);
		scoreMap.put("Tom", 80);
		scoreMap.put("Ram", 50);
		scoreMap.put("Amish", 70);
		scoreMap.put("Suresh", 90);
		scoreMap.put("Rao", 70);
		scoreMap.put("Amish", 70); // HashMap maintains Unique keys
		scoreMap.put("", 70);
		scoreMap.put(null, 70);
		scoreMap.put(null, 80);
		
		// Check map is empty 
		System.out.println("Is map empty:"+scoreMap.isEmpty());
		
	   // Fetch the element from map.
		System.out.println("Ram score:"+scoreMap.get("Ram"));
		
	   // Check specified key available or not. (ContainsKey)
		if(scoreMap.containsKey("Amish")) {
			System.out.println("specified key is available");
		}else {
			System.out.println("key is not available");
		}
		
		System.out.println("scoreMap::"+scoreMap);
		
		HashMap<String,Integer> marksMap = new HashMap<String,Integer>();
		marksMap.put("Vani", 60);
		marksMap.put("Krishna", 80);
		marksMap.put("Naidu", 50);
		System.out.println("marksMap::"+marksMap);
		
		// combine two HashMap
		scoreMap.putAll(marksMap);
		System.out.println("scoreMap ::"+scoreMap);
		
		// Print all key value pairs.
		
		
	}

}
