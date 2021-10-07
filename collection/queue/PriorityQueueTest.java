package com.te.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
		integers.add(10);
		integers.add(1);
		integers.add(2);
		integers.add(9);
		integers.add(9);
		integers.add(4);

		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
		System.out.println("-------------------------------");
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(35);
		queue.add(10);
		queue.add(40);
		queue.add(50);
		System.out.println(queue);
		integers.addAll(queue);
		System.out.println(integers);
		System.out.println("---------------------------");

		System.out.println(integers.comparator());
		System.out.println(integers);
		System.out.println("--------------------------------");

		System.out.println(integers.contains(50));
		System.out.println("----------------------------------");
		
		System.out.println(integers.containsAll(queue));
		System.out.println("-----------------------------------");
		System.out.println(integers.element());
		System.out.println(integers);
		System.out.println(integers.equals(queue));
		System.out.println("-------------------------------");
		System.out.println(integers.offer(99));
		System.out.println(integers);
		System.out.println("---------------------------------");
		//System.out.println(integers.parallelStream());
		System.out.println(integers.peek());
		System.out.println(integers);
		System.out.println("--------------------------------");
		System.out.println(integers.poll());
		integers.add(50);
		System.out.println(integers);
		
//		Integer [] ar = new Integer[integers];
//		System.out.println(integers.toArray());
		System.out.println("--------------------------");
		integers.remove();
		System.out.println(integers);
		integers.remove(99);
		System.out.println(integers);
		integers.removeAll(queue);
		System.out.println(integers);
		System.out.println("-----------------------------");
		integers.add(10);
		integers.add(1);
		integers.add(2);
		integers.add(9);
		integers.add(9);
		integers.add(4);
		System.out.println(integers.size());
		System.out.println("------------------------------");
		integers.clear();
		System.out.println(integers.isEmpty());
		

	}

}
