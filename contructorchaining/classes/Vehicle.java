package com.te.contructorchaining.classes;

public class Vehicle {
	
	int wheelNos=20;

	public Vehicle() {
		super();
		System.out.println("----vehicle Info------");
		System.out.println();
	}
	
	public Vehicle(int wheelNos) {
		this();
		this.wheelNos = wheelNos;
		System.out.println(wheelNos);
		System.out.println("no of wheels"+ wheelNos);
	}
	
	public Vehicle(String brand ,String model  ) {
		this();
		System.out.println("Brand is "+ brand +" Model is "+ model);
	}
}
