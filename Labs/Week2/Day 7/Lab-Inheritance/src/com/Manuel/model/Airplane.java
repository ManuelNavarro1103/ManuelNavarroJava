package com.Manuel.model;

public class Airplane extends FlyingVehicle{
	
	private short wheels;
	private short propellors;
	
	public Airplane(short wheels, short propellors) {
		this.wheels = wheels;
		this.propellors = propellors;
	}
	
	//getters and setters
	public short getWheels() {
		return this.wheels;
	}
	
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}
	
	public short propellors() {
		return this.propellors;
	}
	
	public void setProppelors(short propellors) {
		this.propellors = propellors;
	}
	
	public void turn() {
		System.out.println("Turning...");
	}

}
