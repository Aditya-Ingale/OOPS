package Inheritance;

class Box3d extends Box{
	double height;
	
	Box3d(double l, double b, double h) {
		super(l, b);
		this.height = h;
	}
		
	double volume() {
		return length * breadth * height;
	}
}
