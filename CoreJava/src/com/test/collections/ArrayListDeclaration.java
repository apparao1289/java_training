package com.test.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDeclaration {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // default capacity is 10
		al.add("Tob");
		al.add(2);
		al.add(3.4);
		
		System.out.println("array list ::"+al);
		
		ArrayList list = new ArrayList(3); // it will create arraylist with capacity of 3.
		list.add("Bob");
		list.add(65);
		System.out.println("Default arraylist using specified capacity:"+list);
		
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("MIami");
		cityList.add("Atlanta");
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(7);
		
		List l = new ArrayList();
		l.add("abc");
		l.add(3);
		l.add(40.2);
		System.out.println("list values:"+l);
		
		List<String> stateList = new ArrayList<String>();
		stateList.add("GA");
		stateList.add("TX");
		System.out.println("state list:"+stateList);
		
	}

}
