package com.te.assignments.Q12;

public class TryWithMultiple {
	public static void main(String[] args) {
		
		try {
			int []ar = new int[5];
			System.out.println(ar[10]);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot divided by zero");
		}	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array does not have that index");
		}
	}

}
