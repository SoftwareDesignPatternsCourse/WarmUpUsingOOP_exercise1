package com.vehicles;

public class Vehicle {

	private String type;

	public Vehicle(String type) {
		super();
		this.type = type;
	}
	
	public void move() {
		if (type.equalsIgnoreCase("Car")) {
			System.out.println("Vroom Vroom Vroom");
		}
		if (type.equalsIgnoreCase("Boat")) {
			System.out.println("horn horn horn");
		}
	}
	
}
