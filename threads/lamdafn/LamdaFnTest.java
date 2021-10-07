package com.te.threads.lamdafn;

public class LamdaFnTest {
	public static void main(String[] args) {
		
		LamdaFn ref = ()-> {
			System.out.println("inside the cout");
		};
		
		LamdaFn ref1 = ()-> {
			System.out.println("one more impl");
		};
		
		LamdaFn ref2 = ()-> {
			System.out.println("Again one more impl");
		};
		
		ref.count();
		ref1.count();
		ref2.count();
	}
}
