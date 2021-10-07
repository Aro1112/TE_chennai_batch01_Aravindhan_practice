package com.te.threads.creationbyrunnable;

public class RunnableLamda {
	public static void main(String[] args) {
		
		Runnable ref1 = ()->{
			System.out.println("-------------One Started----------");
			String []s = {"a","b","c","d"};
			for (String string : s) {
				System.out.println(string);
			}
			System.out.println("-------------One Ended----------");
			
		};
		
		Runnable ref2 = ()->{
			System.out.println("-------------Two Started----------");
			int []i = {1,2,3,4,5};
			for (int j : i) {
				System.out.println(j);	
			}
			System.out.println("-------------Two Ended----------");
			
		};
		Thread t1 = new Thread(ref1);
		Thread t2 = new Thread(ref2);
		t1.start();
		t2.start();
	}
}
