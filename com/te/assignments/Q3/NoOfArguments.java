package com.te.assignments.Q3;

public class NoOfArguments {

	public static void main(String[] ar) {
		int n = ar.length;

		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");

		}
		System.out.println();
		System.out.println("No of arguments passed runtime is :" + n);
	}
}
