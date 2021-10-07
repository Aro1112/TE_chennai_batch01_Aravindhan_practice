package com.te.contructorchaining.tests;

import com.te.contructorchaining.common.AccessMethodsClass;

public class AccessTest extends AccessMethodsClass{

	public static void main(String[] args) {
		AccessTest accessMethodsClass = new AccessTest();
		
		accessMethodsClass.publicMethod();
		accessMethodsClass.protectedMethod();
				
	}
}
