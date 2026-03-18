package Abstraction;

public class Dogl implements AnimalInterface{
	@Override
	public void makeSound() {
		System.out.println("Dog baarks: Woof");}
	
	@Override
	public void eat() {
		System.out.println("Dog eats dog food.");}
	
}


