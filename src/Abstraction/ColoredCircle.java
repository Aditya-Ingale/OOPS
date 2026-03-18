package Abstraction;

public class ColoredCircle implements Colorful {
	double radius;
	
	ColoredCircle(double r){
		this.radius = r;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle with radius"+radius);
	}
	
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public void fillColor(String color) {
		System.out.println("Filling the circle with color:"+color);
	}

}
