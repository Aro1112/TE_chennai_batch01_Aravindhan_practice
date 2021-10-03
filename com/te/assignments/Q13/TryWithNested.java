package com.te.assignments.Q13;

public class TryWithNested {
	public static void main(String[] args) {
		try {
			int[] ar = { 1, 58, 65, 25, 99 };
			System.out.println(ar[2]);	
				try {
					int num = ar[2] / 0;
					System.out.println(num);
				} catch (ArithmeticException e) {
					System.out.println("Number cannot divided by zero");
				}
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("Array does not have that index");
			}
			
	}

}
