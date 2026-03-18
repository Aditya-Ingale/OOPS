package Inheritance;

class Box {
	double length, breadth;
	
	Box(double l, double b){
		this.length = l;
		this.breadth = b;
	}
	
	double area() {
		return length * breadth;
	}
}