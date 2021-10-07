package com.te.contructorchaining.common;

public class AccessTest {

	public static void main(String[] args) {
		AccessMethodsClass accessMethodsClass = new AccessMethodsClass();
		accessMethodsClass.publicMethod();
		accessMethodsClass.protectedMethod();
		accessMethodsClass.defaultMethod();
	}
}
