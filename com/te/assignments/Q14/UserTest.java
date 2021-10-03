package com.te.assignments.Q14;

import com.te.assignments.Q15.User;

public class UserTest {

	public static void sub() {
		User.a = 30;
		User.b = 20;
		int sub = User.a - User.b;
		System.out.println("Subraction of number is : " + sub);
	}

	public static void divide() {

		int res = User2.c / User2.d;
		System.out.println("Quotient of the numbers is : " + res);

	}

	public static void main(String[] args) {
		UserTest.sub();
		UserTest.divide();
		User2 user2 = new User2();
		user2.mutiple();
		User user = new User();
		user.add();

	}

}
