package com.te.contructorchaining.tests;

import com.te.contructorchaining.classes.Bike;
import com.te.contructorchaining.classes.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		new Vehicle();
		new Vehicle(4);
		new Vehicle("Benz", "XY");
		new Bike();
		new Bike(2);
		new Bike("hero", "passion pro");
	}
}
