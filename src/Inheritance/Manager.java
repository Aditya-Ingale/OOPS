package Inheritance;

class Manager extends Member{
	String department;
	
	void setManager(String n, String add, String ph, int ag, double sal, String dept) {
		setData(n, add, ph, ag, sal);
		department = dept;
	}
	
	void display() {
		 System.out.println("\n--- Manager ---");
		 System.out.println("Name : " + name);
		 System.out.println("Age : " + age);
		 System.out.println("Phone : " + phone);
		 System.out.println("Address : " + address);
		 printSalary();
		 System.out.println("Dept : " + department);
		 }

}
