package com.te.assignments.Q5;

import java.util.Scanner;

public class SimpleIntrest {
	
	public void intrestAmount() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Principal Amount : ");
		int pAmount = scanner.nextInt();
		System.out.println("Enter the number of years : ");
		int year = scanner.nextInt();
		scanner.close();
		double simpleIntrest;
		
		simpleIntrest= pAmount*(0.09)*year;
		System.out.println("Assuming rate of intrest as 9%");
		System.out.println("The Simple Intrest is : "+simpleIntrest);
}

}
