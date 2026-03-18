package Abstraction;

public interface Vehicle {
	default void startEngine() {
		System.out.println("Engine started");
	}

}


