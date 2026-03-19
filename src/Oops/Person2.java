package Oops;

public class Person2 {
	private String name;
	private int age;
	private String country;
	
	public Person2(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void display(String name, int age) {
		System.out.println("Object field - Name: " + this.name + ", Age: " + this.age);
		System.out.println("Method param - Name: " + name + ", Age:" + age);
	}
	
	public int compareAge(Person2 other) {
		return this.age - other.age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
