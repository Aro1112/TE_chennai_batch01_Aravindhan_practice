package com.te.collectionImpl.set;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(10);
		set.add(20);
		set.add(40);

		System.out.println(set);

		System.out.println("------------contains-----------------");
		System.out.println(set.contains(30));

		System.out.println("------------containsAll-----------------");
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(40);
		System.out.println(set1);
		System.out.println(set.containsAll(set1));

		System.out.println("------------equals-----------------");
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(20);
		set2.add(100);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set1.equals(set2));

		System.out.println("-----------clear------------------");
		set2.clear();
		System.out.println(set2);

		System.out.println("-----------isEmpty------------------");
		System.out.println(set2.isEmpty());

		System.out.println("-------------remove----------------");
		System.out.println(set);
		set.remove(70);
		System.out.println(set);

		System.out.println("-------------retainAll----------------");
		System.out.println(set);
		System.out.println(set1);
		set.retainAll(set1);
		System.out.println(set);

		System.out.println("-------------removeAll----------------");
		System.out.println(set);
		set.removeAll(set1);
		System.out.println(set);

		System.out.println("--------------------------------------");

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(10);
		set.add(20);
		set.add(40);

		System.out.println(set);
		System.out.println("-------------------size-----------------");

		System.out.println(set.size());

		System.out.println("-------------------toArray-----------------");
		Object[] arr = set.toArray();
		for (Object object : arr) {
			System.out.print(object + " ");
		}
		System.out.println();
		System.out.println("-------------------toString-----------------");
		System.out.println(set.toString());
	}

}
