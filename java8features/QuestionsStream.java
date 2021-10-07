package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionsStream {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();

		integers.add(10);
		integers.add(7);
		integers.add(11);
		integers.add(5);
		integers.add(25);
		integers.add(40);
		integers.add(3);
		
		List<Integer>even = integers.stream().map((a)->{
			if(a%2==0) {
				return a;
			} else {
				return a+1;
			}
		}).collect(Collectors.toList());
		System.out.println("Even number"+even);
		System.out.println("original"+integers);
		
		List<Integer>odd = integers.stream().map((a)->{
			if(!(a%2==0)) {
				return a;
			} else {
				return a+1;
			}
		}).collect(Collectors.toList());
		System.out.println("Even number"+odd);
		
		List<Double>sqrt = integers.stream().map(a-> Math.sqrt(a)).collect(Collectors.toList());
		System.out.println("sqrt number"+sqrt);
		
		
		
	}

}
