package com.te.threads.creationbyrunnable;

public class ThreaOne implements Runnable{

	@Override
	public void run() {
		System.out.println("-------------One Started----------");
		String []s = {"a","b","c","d"};
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println("-------------One Ended----------");
	}
	

}
