package Oops;

public class Person {
	private String name;
	private int age;
	private String country;
	
	public void setData(String n, int a, String c) {
		this.name = n;
		this.age = a;
		this.country = c;
	}
	
	public void getData() {
		System.out.println("Name: "+ name);
		System.out.println("Age: " + age);
		System.out.println("Country: " + country);
	}
}
