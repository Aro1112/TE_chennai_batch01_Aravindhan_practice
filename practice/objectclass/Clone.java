package com.te.practice.objectclass;

public class Clone  {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEid(10);
		emp1.setEname("Aravind");
		emp1.setRole("Full Stack Developer");
		emp1.setSal(50000);
		
		System.out.println("Before change");
		Employee emp2 = null;
		try {
			System.out.println("Emp :" + emp1);
			emp2 = (Employee)emp1.clone();
			System.out.println("Emp2 :"+ emp2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("After change");
		emp1.setEid(50);
		emp1.setEname("bharath");
		
		System.out.println("Emp" + emp1);
		System.out.println("emp2" + emp2);
		
		
	}
}
