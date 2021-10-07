package com.te.threads.creationbyrunnable;

public class Test {
		public static void main(String[] args) {
		System.out.println("---------Main Stared-----------");
		//ThreaOne one= new ThreaOne();
		//ThreadTwo two = new ThreadTwo();
		
		Thread ref= new Thread(new ThreaOne());
		Thread ref2= new Thread(new ThreadTwo());
		
		ref.start();
		ref2.start();
		System.out.println("-----------------Main Ended-------");
	}

}
