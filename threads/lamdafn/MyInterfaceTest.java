package com.te.threads.lamdafn;

public class MyInterfaceTest {
	public static void main(String[] args) {

		MyInterface ref = a -> {
			System.out.println("hi");
		};

		MyInterface ref1 = (a) -> {
			System.out.println("hello");
		};

		MyInterface ref2 = (c) -> {
			System.out.println("how are you..");
		};

		ref.print(10);
		ref1.print(30);
		ref2.print(40);

	}

}
