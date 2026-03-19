package Oops;

public class Student {
	private int rollno;
	private String name;
	private int age;
	
	public void setData(int r, String n, int a) {
		this.rollno = r;
		this.name = n;
		this.age = a;
	}
	
	public void getData() {
		System.out.println("rollno = " + rollno);
		System.out.println("Name = " + name);
		System.out.println("age = " + age);
	}
}
