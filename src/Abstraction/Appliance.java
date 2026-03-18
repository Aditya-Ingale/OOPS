package Abstraction;

abstract class Appliance {
	String brand;
	double powerConsumption;
	
	Appliance(String brand, double power){
		this.brand = brand;
		this.powerConsumption = power;
	}
	
	abstract void turnOn();
}
