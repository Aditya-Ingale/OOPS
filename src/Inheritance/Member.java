package Inheritance;

class Member {
	String name, address, phone;
	int age;
	double salary;
	
	void setData(String n, String add, String p, int ag, double s) {
		name = n;
		address = add;
		phone = p;
		age = ag;
		salary = s;
	}
	
	void printSalary() {
		System.out.println("Salary: " + salary);
	}
}
