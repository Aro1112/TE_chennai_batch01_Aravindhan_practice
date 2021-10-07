package com.te.threads.creation;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("----------mainstarts-------------");

		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();
		// one.run();
		one.start();
		System.out.println("-----------------------------------");
		// two.run();
		two.start();
		System.out.println("---------main ends----------------");
	}
}
