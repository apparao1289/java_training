package com.test.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> priQueue = new PriorityQueue<>(); // create queue with default capacity of 11
		PriorityQueue<String> priQueueWithCapacity = new PriorityQueue<>(8); // create queue with default capacity of 8
		Queue<String> queue = new PriorityQueue<>(); // create queue with default capacity of 11
		queue.add("Hyderabad");
		queue.add("Bangalore");
		queue.add("Mumbai");
		queue.add("Chennai");
		
		System.out.println("queue::"+queue);
		
		// peek() method
		System.out.println("peek()::"+queue.peek());
		System.out.println("queue after peek()::"+queue);
		
		// poll() method
		System.out.println("poll()::"+queue.poll());
		System.out.println("queue after the poll()::"+queue);
		
		// print all elements form queue
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove()
		queue.remove();
		System.out.println("queue after remove()::"+queue);
	}

}
