package com.tecno.string;

import java.util.Scanner;

public class StringMethods {

	static Scanner s;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String s1 : ");
		String s1 = s.nextLine();
		System.out.println("Enter the String s2: ");
		String s2 = s.nextLine();
		System.out.println("Enter the String s3: ");
		String s3 = s.nextLine();
		s.close();
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.substring(1, 2));
		System.out.println(s1.concat(" and He is an developer"));
		System.out.println(s1.replace('a', '1'));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 2));
		System.out.println(s1.toCharArray());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.contains("is"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.isEmpty());

	}

}
