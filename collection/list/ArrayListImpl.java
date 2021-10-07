package com.te.collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
public class ArrayListImpl {
	public static void main(String[] args) {
		
		List list =  new ArrayList();
		
		list.add(10);
		list.add("Name");
		list.add(null);
		list.add(10);
		list.add(null);
		list.add('a');
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
