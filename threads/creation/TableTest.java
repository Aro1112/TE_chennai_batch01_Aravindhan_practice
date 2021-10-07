package com.te.threads.creation;

public class TableTest {
	
	public static void main(String[] args) {
		Table table = new Table();
		
		Runnable ref = ()->{
			table.tableInfo(3);
		};
		
		Runnable ref1 = ()->{
			table.tableInfo(5);
		};
		
		Thread thread1 = new Thread(ref);
		Thread thread2 = new Thread(ref1);
		
		thread1.start();
		thread2.start();
		
	}

}
