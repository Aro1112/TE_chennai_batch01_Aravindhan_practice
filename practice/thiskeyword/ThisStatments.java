package com.te.practice.thiskeyword;

public class ThisStatments {

	 ThisStatments() {
		super();
		System.out.println("zero");
	}
	 
	 ThisStatments(int i){
		 this();
		 System.out.println("one para");
	 }
	 ThisStatments(int i,double d){
		 this(i);
		 System.out.println("multi para");
	 }
	 
	 public static void main(String[] args) {
		new ThisStatments();
		new ThisStatments(1);
		new ThisStatments(1 );
	}
}
