package Abstraction;

class WashingMachine extends Appliance {
	WashingMachine(String brand, double power){
		super(brand, power);
	}
	
	@Override
	void turnOn() {
		System.out.println("Washing Machine [" + brand + "] turned ON. " + "Power consumed: " + powerConsumption + "W");
	}
}
