package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPITest {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();

		integers.add(10);
		integers.add(7);
		integers.add(11);
		integers.add(5);
		integers.add(25);
		integers.add(40);
		integers.add(3);
		integers.add(10);
		integers.add(7);
		integers.add(11);

		System.out.println("original" + integers);

		List<Integer> mapListOutput = integers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("MapListOutput" + mapListOutput);
		Set<Integer> mapSetOutput = integers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println("MapSetOutput" + mapSetOutput);
		System.out.println("After map" + integers);
		System.out.println("-----------------------------------");
		// integers.stream().map(x->x*x).forEach(System.out::println);

		System.out.println("-----------------sorted------------------");
		List<Integer> ref = integers.stream().sorted().collect(Collectors.toList());
		System.out.println(ref);
		System.out.println("original" + integers);

		System.out.println("-----------distinct-------------------");
		List<Integer> dis = integers.stream().distinct().collect(Collectors.toList());
		System.out.println("original" + integers);
		System.out.println("Distinct " + dis);

		System.out.println("-----------------count------------------------");
		long count = integers.stream().count();
		System.out.println("count " + count);

		System.out.println("-----------------skip---------------");
		List<Integer> skip = integers.stream().skip(5).collect(Collectors.toList());
		System.out.println("original" + integers);
		System.out.println(skip);

		System.out.println("-------------filtered----------------");
		List<Integer> filter = integers.stream().filter(a -> (a % 2 == 0)).collect(Collectors.toList());
		System.out.println("original" + integers);
		System.out.println("Filtered " + filter);

	}

}
