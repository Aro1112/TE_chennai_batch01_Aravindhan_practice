package com.te.assignments.Q11;

import java.util.Scanner;

public class StringMethod {

	//Method implementation
	public boolean equals(String str, String str1) {
		return (str == str1) ? true : false;
	}

	public String reverse(String str) {
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			  str2 = str2+ str.charAt(i);
		}
		return str2;
	}
	
	public void stringMthods() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the strings : ");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		StringBuilder s3 = new StringBuilder(scanner.nextLine());
		scanner.close();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.reverse());
		
	}
}
