package com.technoelevate.first;

public class AccessMethod {

	public void publicMethod() {
		System.out.println("this is public method"+AccessMethod.class);
	}
	
	protected void protectedMethod() {
		System.out.println("this is protected method"+AccessMethod.class);
	}
	
	void defaultMethod() {
		System.out.println("this is default method"+AccessMethod.class);
	}
	
	//private void privateMethod() {
	//	System.out.println("this is private method"+AccessMethod.class);
	//}
	
}
