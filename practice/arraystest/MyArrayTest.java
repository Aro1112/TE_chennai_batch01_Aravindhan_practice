package com.te.practice.arraystest;

import com.te.practice.arrays.MyArrayV4;

public class MyArrayTest {

	public static void main(String[] args) {
		
		MyArrayV4 array=new MyArrayV4();
		System.out.println(array.size());
		
		System.out.println(array.add(10));
		System.out.println(array.add("hi"));
		System.out.println(array.add(null));
		System.out.println(array.add(true));
		System.out.println(array.add(50));
		System.out.println("-----------------------");
		System.out.println(array.add("aravind"));
		
		System.out.println("Reading data");
		System.out.println(array);
		
		System.out.println("setting the values");
		array.set(4, "Iam a developer");
		array.set(0, 99);
		
		System.out.println(array);
		
		System.out.println("Removing the element by index");
		System.out.println("Before removing : "+array.size());
		array.remove(0);
		array.remove(3);
		System.out.println("After removing : "+array.size());
		System.out.println(array);
	}
}
