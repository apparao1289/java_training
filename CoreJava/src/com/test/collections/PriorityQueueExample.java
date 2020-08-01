package com.test.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Emp> queue = new PriorityQueue<>();
		
		Emp e1 = new Emp(123, "Bob", "P", 5000.0, "Software Engineer");
		queue.add(e1);
		queue.add(new Emp(222, "Tom", "B", 2000.0, "Software Developer"));
		queue.add(new Emp(331, "Ramu", "T", 8000.0, "Software Manager"));
		queue.add(new Emp(112, "Suresh", "G", 1000.0, "Quality Engineer"));
		
		System.out.println("Id:"+  "     first name:"+ "      last name"+"        salary"+"     designanation");
		for(Emp e : queue) {
			System.out.println(e.getId()+  "   "+e.getFirstName()+"      "+e.getLastName()+"       "+e.getSalary()+"     "+e.getDesignation());
			
		}
	}

}
