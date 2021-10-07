package com.te.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WayOfIteration {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(50);
		list.add(90);

		System.out.println("-----------using for--------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" "+list.get(i));
		}
		System.out.println();

		System.out.println("-----------using foreach--------");
		for (Integer integer : list) {

			System.out.print(" "+integer);

		}
		System.out.println();

		System.out.println("-----------using Iterator--------");

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
		System.out.println();

		System.out.println("-----------using listIterator(forward)--------");

		ListIterator<Integer> itr1 = list.listIterator();
		while (itr1.hasNext()) {
			System.out.print(" " + itr1.next());
		}
		System.out.println();

		System.out.println("-----------using listIterator(Backward)--------");

		ListIterator<Integer> itr2 = list.listIterator(list.size());
		while (itr2.hasPrevious()) {
			System.out.print(" " + itr2.previous());
		}
		System.out.println();
	}

}
