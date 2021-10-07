package com.te.threads.deadlock;

public class DeadLockTest {
	public static void main(String[] args) {

		String s = "a";
		String s1 = "b";

		Runnable ref = () -> {
			synchronized (s) {
				System.out.println(s);

				synchronized (s1) {
					System.out.println(s1);
				}
			}
		};
		Runnable ref1 = () -> {
			synchronized (s1) {
				System.out.println(s);

				synchronized (s) {
					System.out.println(s1);
				}
			}
		};

		new Thread(ref).start();
		new Thread(ref1).start();

	}
}
