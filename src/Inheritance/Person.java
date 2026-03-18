package Inheritance;

class Person {
	String name;
	int age;
	
	void SetData(String n) {
		name = n;
	}
	
	void SetData(String n, int a) {
		name = n;
		age = a;
	}
	
	void GetData() {
		System.out.println("Name: " + name + " Age: " + age);
	}

}
