package com.te.exception;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username :");
		String Username = sc.next();
		System.out.println("Enter the password :");
		String pwd = sc.next();
		
		ThrowKey key = new ThrowKey();
		key.getInput(Username, pwd);
		sc.close();
	}
}
