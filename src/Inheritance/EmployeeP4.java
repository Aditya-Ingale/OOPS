package Inheritance;

 class EmployeeP4 extends PersonP4 {
	 int empId;
	 
	 EmployeeP4(String name, int id){
		 super(name);
		 this.empId = id;
		 System.out.println("Employee constructor: ID=" + id);
	 }

}
