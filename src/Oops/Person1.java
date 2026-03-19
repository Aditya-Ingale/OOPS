package Oops;

public class Person1 {
	private String name;
	private int age;
	private String country;
	
	public Person1() {
		this.name="Unknown";
		this.age=0;
		this.country="Unknown";
	}
	
	public Person1(String name) {
		this.name=name;
		this.age=0;
		this.country="Unknown";
	}
	public Person1(String name,int age,String country) {
		this.name=name;
		this.age=age;
		this.country=country;
		
	}
	public void displayDetails() {
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("Country= "+country);
	}
	

}
