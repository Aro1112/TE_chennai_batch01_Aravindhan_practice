package com.te.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(5);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(0);
		treeSet.add(6);
		treeSet.add(2);
		treeSet.add(7);
		treeSet.add(4);
		treeSet.add(8);
		treeSet.add(10);
		treeSet.add(9);
		treeSet.add(11);
		

		Iterator<Integer> iterator = treeSet.iterator();

		while (iterator.hasNext()) {

			System.out.print(iterator.next() + " ");
		}
		System.out.println("\n--------------------------------");
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(9));
		System.out.println(treeSet.clone());
		System.out.println("------------------------------");
		System.out.println(treeSet.descendingIterator());
		

	}

}
