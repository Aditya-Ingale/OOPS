package Abstraction;

public class Catl implements AnimalInterface{
	@Override
	public void makeSound() {
		System.out.println("Cat Meows:Meow!");
	}
	
	@Override
	public void eat() {System.out.println("Cat eats fish");

}
}