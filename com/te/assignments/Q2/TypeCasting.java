package com.te.assignments.Q2;

public class TypeCasting {

	public void casting() {

		int i = 100;
		long l = 3514343613643l;
		float f = 5.5f;
		double d = 1656565.544;
		int i1;
		long l1;
		float f1;
		double d1;

		System.out.println("Widening");
		System.out.println(i1 = i);
		System.out.println(l1 = i);
		System.out.println(f1 = i);
		System.out.println(d1 = i);

		System.out.println(l1 = l);
		System.out.println(f1 = l);
		System.out.println(d1 = l);

		System.out.println(f1 = f);
		System.out.println(d1 = f);

		System.out.println(d1 = d);
		
		System.out.println("-------------------------------------");

		System.out.println("Narrowing");

		// Adding cast Statement to perform Narrowing
		System.out.println(i1 = (int) l);
		System.out.println(i1 = (int) f);
		System.out.println(l1 = (long) f);
		System.out.println(i1 = (int) d);
		System.out.println(l1 = (long) d);
		System.out.println(f1 = (float) d);

	}

}
