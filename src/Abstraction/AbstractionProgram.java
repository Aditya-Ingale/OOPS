package Abstraction;
import java.util.*;

public class AbstractionProgram {
	public static void main(String[] args) {
		//----1----
		System.out.println("=================================");
		System.out.println("Program 1: Abstract Class Shape");
		System.out.println("=================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int ra = sc.nextInt();
		System.out.print("Enter length: ");
		int l = sc.nextInt();
		System.out.print("Enter width: ");
		int w = sc.nextInt();
		Circle c = new Circle(ra);
		Rectangle r = new Rectangle(l, w);
		System.out.println("Circle area : " + c.area());
		System.out.println("Rectangle area : " + r.area());
		System.out.println();
		
		
		//----2----
		System.out.println("=================================");
		System.out.println("Program 2: Abstract Class Anima");
		System.out.println("=================================");
		Animal[] animals = {new Dog(), new Cat(), new Cow()};
		for(Animal a: animals)
			a.sound();
		System.out.println();
		
		
		//---3----
		System.out.println("=================================");
		System.out.println("Program 3: Abstract class Appliance");
		System.out.println("=================================");
		Appliance[] appli = {new WashingMachine("Samsung", 100), 
				new Refrigerator("LG", 500), 
				new Microwave("Panasonic", 100)};
		for(Appliance a: appli)
			a.turnOn();
		System.out.println();
		
		
		//---4 ----
		System.out.println("=================================");
		System.out.println("Program 4: Interface AnimalInterfae");
		System.out.println("=================================");
		AnimalInterface dog=new Dogl();
		AnimalInterface cat=new Catl();
		dog.makeSound();dog.eat();
		cat.makeSound();cat.eat();
		System.out.println();
		
		
		//---5---
		System.out.println("=================================");
		System.out.println("ProgramProgram 5: Interface Default Method");
		System.out.println("=================================");
		Vehicle vehicle=new Vehicle() {};
		vehicle.startEngine();
		Car car=new Car();
		car.startEngine();		
		System.out.println();
		
		//---6---
		System.out.println("=================================");
		System.out.println("ProgramProgram 6:  Interface Inheritance");
		System.out.println("=================================");
		System.out.print("Enter radius of circle: ");
		int rad = sc.nextInt();
		ColoredCircle cc=new ColoredCircle(rad);
		cc.draw();
		System.out.println("Area: "+cc.calculateArea());
		cc.fillColor("Red");
		System.out.println();
		
		
		//---7---
		System.out.println("\n========================================");
        System.out.println("Program 7: Interface Multiple Implementations");
        System.out.println("========================================");
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new CreditCardPayment(), 250.00);
        processor.processPayment(new PayPalPayment(),     175.50);
        System.out.println();
        
        
        // ---- Program 8 ----
        System.out.println("\n========================================");
        System.out.println("Program 8: Anonymous Inner Class (Interface)");
        System.out.println("========================================");
        new GreetingDemo().generateGreeting();
        System.out.println();

        // ---- Program 9 ----
        System.out.println("\n========================================");
        System.out.println("Program 9: Anonymous Inner Class (Abstract Class)");
        System.out.println("========================================");
        new ShapeFactory().createShape();
        System.out.println();

        // ---- Program 10 ----
        System.out.println("\n========================================");
        System.out.println("Program 10: Anonymous Inner Class (Regular Class)");
        System.out.println("========================================");
        new PrinterFactory().createPrinter();
        System.out.println();
        
        sc.close();

	}
}
