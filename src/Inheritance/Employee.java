package Inheritance;

class Employee extends Person{
	int empId;
	double salary;
	
	void setData(String n, int a, int id, double sal) {
		super.SetData(n, a);
		empId = id;
		salary = sal;
	}
	
	@Override
	void GetData() {
		super.GetData();
		System.out.println("ID: " + empId + " Salary: " + salary);
	}
	
}
