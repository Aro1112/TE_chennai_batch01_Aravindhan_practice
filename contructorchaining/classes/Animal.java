package com.te.contructorchaining.classes;

public class Animal {

	public void eat() {
		System.out.println("Eating ......");
	}

	
	public int eat(String petname) {
		System.out.println(petname + " is Eating");
		return 0;
	}
}
