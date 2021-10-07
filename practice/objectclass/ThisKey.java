package com.te.practice.objectclass;

public class ThisKey {
	
	ThisKey(){
		System.out.println("1");
	}
	
	ThisKey(int a, int b){
		this();
		System.out.println("2");
	}
	
	ThisKey(double d){
		this(1,1);
		System.out.println("3");
	}
	
	

}
