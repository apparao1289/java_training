package com.test.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PutAllMethodExample {

	public static void main(String[] args) {
		Map<String,Integer> scoreMap = new HashMap<>();
		scoreMap.put("Ram", 60);
		scoreMap.put("Tom", 40);
		scoreMap.put("Bob", 80);
		System.out.println("scoreMap:"+scoreMap);
		
		Map<String,Integer> marksMap = new HashMap<>();
		marksMap.put("Suresh", 55);
		marksMap.put("Ramu", 67);
		System.out.println("marksMap:"+marksMap);
		
		scoreMap.putAll(marksMap);
		System.out.println("final map:"+scoreMap);
		
		Set<String> set = scoreMap.keySet();
		
		for(String key : set) {
			System.out.println("key::"+key + "     value::"+scoreMap.get(key));
		}
		
		// Immutable Map
		Map<String,Integer> immutableMap = Collections.unmodifiableMap(scoreMap);
		
		//immutableMap.put("Apparao", 24);
		
		System.out.println("immutableMapp:"+immutableMap);
		
		// Synchronized map
		Collections.synchronizedMap(scoreMap);
	}

}
