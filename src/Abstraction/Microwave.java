package Abstraction;

class Microwave extends Appliance {
    Microwave(String brand, double power) { super(brand, power); }

    @Override
    void turnOn() {
        System.out.println("Microwave [" + brand + "] turned ON. "
                + "Power consumed: " + powerConsumption + "W");
    }
}