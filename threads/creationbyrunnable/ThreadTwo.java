package com.te.threads.creationbyrunnable;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("-------------Two Started----------");
		int []i = {1,2,3,4,5};
		for (int j : i) {
			System.out.println(j);	
		}
		System.out.println("-------------Two Ended----------");
	}

}
