package com.te.assignments.Q7;

import java.util.Scanner;

public class GcdOfNum {

	public void gcd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ener the number : ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		scanner.close();
		int gcd =1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}

		}
		System.out.println("GCD of " + n1 + " and " + n2 + " is :" + gcd);
	}

}
