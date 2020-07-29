package com.test.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintKeysAndValuesOfHashMap {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("Tom", "Software engineer");
		map.put("Bob", "Quality Engineer");
		map.put("Ram", "Manager");
		printHshMapEntries(map);
		printHashMapEntriesUsingForloop(map);
	}
	
	public static  void printHshMapEntries(HashMap<String,String> map) {
		if(null != map && !map.isEmpty()) {
			Set set = map.entrySet();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				Map.Entry entry = (Map.Entry)it.next();
				System.out.println("key:"+entry.getKey() + "  value:"+entry.getValue());
			}
		}
	}
	
	public static void printHashMapEntriesUsingForloop(HashMap<String,String> map) {
		System.out.println("printHashMapEntriesUsingForloop :: ");
		for(Map.Entry entry:map.entrySet()) {
			System.out.println("key:"+entry.getKey() + "  value:"+entry.getValue());
		}
	}

}
