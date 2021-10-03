package com.te.assignments.Q8;

public class BankTest extends Bank {
	public static void main(String[] args) {

		Bank.bankdetails("ICICI", "chennai", 9788167685L);
		
		System.out.println("******WELCOME TO ICICI BANK********");
		System.out.println("Befor Transcation the current balance is : " + Bank.currentBalance);
		
		Bank.deposit();
		Bank.getbalance();
		System.out.println("After Transcation banking the current balance is : " + Bank.currentBalance);

		Bank.withdrawal();
		Bank.getbalance();
		
		System.out.println("After Transcation banking the current balance is : " + Bank.currentBalance);

		System.out.println("!!!---THANK YOU FOR BANKING WIT US HAVE A GOOD DAY!!!---");
	}
}
