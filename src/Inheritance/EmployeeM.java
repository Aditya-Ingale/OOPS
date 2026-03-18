package Inheritance;

class EmployeeM extends Member{
	String specialization;
	
	void setEmployee(String n, String add, String ph, int ag, double sal, String spec) {
		setData(n, add, ph, ag, sal);
		specialization = spec;
	}
	
	void display() {
		System.out.println("\n---Employee---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone: " + phone);
		System.out.println("Address: " + address);
		printSalary();
		System.out.println("Spec: " + specialization);
	}
}
