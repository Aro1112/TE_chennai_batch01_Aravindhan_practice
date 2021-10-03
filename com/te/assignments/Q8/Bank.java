package com.te.assignments.Q8;

import java.util.Scanner;

public class Bank {
	static String bankName, bankAddress;
	static long bankphoneNo;
	static String ifscode = "ICIC00198";
	static int currentBalance = 10000;
	static int wAmount;
	static int dAmount;
	static Scanner scanner= new Scanner(System.in);

	static void bankdetails(String name, String address, long phoneNo) {
		bankName = name;
		bankAddress = address;
		bankphoneNo = phoneNo;
		System.out.println("******Bank Details*******");
		System.out.println("Bank Name : " 
						+ name + " || Address : " + address + " || contact : " + phoneNo + " || IFSC code : " + ifscode);
	}

	static void withdrawal() {
		System.out.println("Enter the withdrawal amount : ");
		wAmount = scanner.nextInt();
		currentBalance = currentBalance - wAmount;
	}

	static void deposit() {
		System.out.println("Enter the deposit amount : ");
		dAmount = scanner.nextInt();
		currentBalance = currentBalance + dAmount;
	}

	static int getbalance() {
		return currentBalance;
	}
}
