package com.te.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
	public static void main(String[] args) {
		
		Set<Integer> integers = new HashSet<Integer>();
		
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(40);
		integers.add(50);
		System.out.println("--------- for each------");
		
		for (Integer integer : integers) {
			
			System.out.println(integer);
		}
		System.out.println("--------- iterator------");
		
		Iterator<Integer> iterator =  integers.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>(integers);	
		System.out.println("Before sort" + arrayList);
		Collections.sort(arrayList);
		System.out.println("After sort "+arrayList);
	}

}
