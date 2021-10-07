package com.te.threads.creation;

public class Bank {

	int amount = 10000;
	public synchronized void withDraw(int money) {
		System.out.println("Going to withdraw");
		if(money > amount) {
			System.out.println("Less Balance...!! Waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount -= money;
		System.out.println("Withdraw Successful");
	}
	
	public synchronized void deposit (int money) {
			System.out.println("Depositing MOney -_-");
		amount += money;
		System.out.println("Deposit Successful");
		notify();
	}
	
}
