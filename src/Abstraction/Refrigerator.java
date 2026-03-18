package Abstraction;

class Refrigerator extends Appliance {
    Refrigerator(String brand, double power) { super(brand, power); }

    @Override
    void turnOn() {
        System.out.println("Refrigerator [" + brand + "] turned ON. "
                + "Power consumed: " + powerConsumption + "W");
    }
}
