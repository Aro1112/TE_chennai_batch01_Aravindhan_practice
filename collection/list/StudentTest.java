package com.te.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest  {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(10,"Aravind"));
		list.add(new Student(70,"Dinesh"));
		list.add(new Student(20,"Dani"));
		list.add(new Student(40,"Jack"));
		list.add(new Student(30,"Ben"));
		
		for (Student student : list) {
			System.out.println(student);
			
		}
		
		System.out.println("After sort");
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
