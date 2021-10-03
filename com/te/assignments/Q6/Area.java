package com.te.assignments.Q6;

public class Area {
	double side;
	double length;
	double breadth;

	public void areaBox() {

		double area = this.side * this.side;
		System.out.println("Area of box : " + area);
	}

	public void areaRec() {

		double area1 = this.length * this.breadth;
		System.out.println("Area of rectangle : " + area1);
	}

}
