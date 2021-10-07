package com.te.java8features;

import java.util.ArrayList;
import java.util.List;

public class List8Methods {
	public static void main(String[] args) {
		
		List<Integer> integers = new ArrayList<Integer>();
		
		integers.add(10);
		integers.add(7);
		integers.add(11);
		integers.add(5);
		integers.add(25);
		integers.add(40);
		integers.add(3);
		
		System.out.println("original list"+integers);
		integers.forEach(a->System.out.println(a*a));
		System.out.println("after forEach()"+integers);
		
		System.out.println("-----method ref(non-static) -----------");
		integers.forEach(System.out::println);
		
		System.out.println("---------methodref (static)------------");
		integers.forEach(List8Methods::getData);
		
		System.out.println("original list"+integers);
		integers.removeIf(x->x>7);
		System.out.println("after remove if "+integers);
		integers.removeIf(List8Methods::greater);
		System.out.println("after using method ref"+integers);
	}
	
	public static void getData(int a) {
		System.out.println(a+" from another method");
	}

	public static boolean greater(int a) {
		return a>5;	
	}
}
