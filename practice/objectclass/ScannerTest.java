package com.te.practice.objectclass;

import java.util.Scanner;

public class ScannerTest {
	
	static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		Employee e1 = new Employee();
		System.out.println("Enter the Employee details ");
		
		System.out.println("0Enter ID :");
		int eid = Integer.parseInt(scanner.next());
		e1.setEid(eid);
	}
}
