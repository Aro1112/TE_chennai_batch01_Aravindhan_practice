package com.technoelevate.first.common;

public class A {
	
	 int a;
	 int b;

	public A(int a, int b){
		this.a = a;
		this.b = b;
		this.power();
	}
	
	public void power() {
		System.out.println(Math.pow(a, b));
	}

}
