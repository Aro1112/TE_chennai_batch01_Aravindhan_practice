package com.te.exception;

//import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		// Scanner s = new Scanner(System.in);
		// we can use the nested or multiple try catch block
		try {
			String name = "Aravind";
			System.out.println(name.length());

		} catch (NullPointerException e) {

			System.out.println("String is null");

		}

		try {
			int a = 10;
			int b = 2;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero is not possible");
		}

		int c = 10;
		int d = 0;
		System.out.println(c / d);
	}
}