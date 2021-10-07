package com.te.threads.creation;

public class Table {
	
	public synchronized void tableInfo(int a ) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i*a);
		}
		System.out.println("table ended " + a);
	}

}
