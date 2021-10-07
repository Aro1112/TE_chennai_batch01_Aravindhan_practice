package com.te.mapinterface.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapImpl {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("A", 20);
		map.put(null, 40);
		map.put("E", 60);
		map.put(null, 50);
		map.put("B", 10);
		map.put("D", null);
		map.put("C", null);
		
		System.out.println(map);
		
		System.out.println("--------EntrySet-----------");
		Set<Entry<String, Integer>> entries =  map.entrySet();
		
		for (Entry<String, Integer> entry : entries) {
			
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		System.out.println("-----------get----------");
		
		Set<String> set = map.keySet();
		for (String key : set) {
			
			System.out.println(key + " = "+map.get(key));
		}
		
		System.out.println("-----------Iterator--------");
		
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("-------------------------------");
		
	}

}
