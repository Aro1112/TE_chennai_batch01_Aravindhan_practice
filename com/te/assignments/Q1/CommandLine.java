package com.te.assignments.Q1;

public class CommandLine {

	public static void main(String[] arr) {
		int n = arr.length;
		int sum = 0;
		int average;
		
		for (int i = 0; i < n; i++) {
			String s = "";
			s += arr[i];

			sum = sum + Integer.parseInt(s);
		}

		average = sum / n;
		System.out.println("The sum of the Number is :" + sum);
		System.out.println("The average of the Number is :" + average);

	}
}
