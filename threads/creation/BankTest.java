package com.te.threads.creation;

public class BankTest {

	public static void main(String[] args) {
		
		final Bank bank = new Bank();
		
		Runnable ref = ()->{
			bank.withDraw(15000);
		};
		
		Runnable ref1 = ()->{
			bank.deposit(10000);
		};
		
		Thread t = new Thread(ref);
		Thread t1 = new Thread(ref1);
		t.start();
		t1.start();
	}
}
