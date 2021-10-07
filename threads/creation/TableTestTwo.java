package com.te.threads.creation;

public class TableTestTwo {
	public static void main(String[] args) {
		Table table = new Table();
		
		Runnable ref = ()->{
			
			synchronized (table) {
				
				table.tableInfo(3);
			}
		};
		
		Runnable ref1 = ()->{
			
			synchronized (table) {
				
				table.tableInfo(5);
			}
		};
		
		Thread thread1 = new Thread(ref);
		Thread thread2 = new Thread(ref1);
		
		thread1.start();
		thread2.start();
		
	}


}
