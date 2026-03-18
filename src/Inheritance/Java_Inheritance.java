package Inheritance;

public class Java_Inheritance {

	public static void main(String[] args) {
		// ---- Program 1 ---- 
        System.out.println("========================================"); 
        System.out.println("Program 1: Box and Box3d"); 
        System.out.println("========================================"); 
        Box   b  = new Box(5, 3); 
        Box3d b3 = new Box3d(5, 3, 4); 
        System.out.println("Box area   : " + b.area()); 
        System.out.println("Box3d area : " + b3.area()); 
        System.out.println("Box3d vol  : " + b3.volume());
        
        // ---- Program 2 ---- 
        System.out.println("\n========================================"); 
        System.out.println("Program 2: Person and Employee"); 
        System.out.println("========================================"); 
        Person p = new Person(); 
        p.SetData("Aditya", 30); 
        System.out.print("Person  -> "); p.GetData(); 
        
        Employee e = new Employee();
        e.setData("Shailesh", 32, 101, 15000.0);
        System.out.print("Empolyee -> ");
        e.GetData();
        
        // ---- Program 3 ---- 
        System.out.println("\n========================================"); 
        System.out.println("Program 3: Multilevel Inheritance"); 
        System.out.println("========================================"); 
        Pug lab = new Pug(); 
        lab.eat();    // from Animal 
        lab.bark();   // from Dog 
        lab.fetch();  // own method 
        
        // ---- Program 4 ----
        System.out.println("\n========================================");
        System.out.println("Program 4: Constructor Chaining");
        System.out.println("========================================");
        System.out.println("Creating Person:");
        new PersonP4("Aditya");
        System.out.println("Creating Employee:");
        new EmployeeP4("Shailesh", 101);
        
        // ---- Program 5 ----
        System.out.println("\n========================================");
        System.out.println("Program 5: Method Calls via Objects");
        System.out.println("========================================");
        Parent par = new Parent();
        Child ch = new Child();
        System.out.print("1. Parent obj -> "); par.display();
        System.out.print("2. Child obj -> "); ch.show();
        System.out.print("3. Child obj -> "); ch.display(); // parent method
        
        // ---- Program 6 ----
        System.out.println("\n========================================");
        System.out.println("Program 6: Member, Employee, Manager");
        System.out.println("========================================");
        EmployeeM emp = new EmployeeM();
        emp.setEmployee("Aditya", "Chennai", "9876543210", 24, 60000, "Java");
        emp.display();
        Manager mgr = new Manager();
        mgr.setManager("Shailu", "Mumbai", "9123456789", 40, 95000, "Engineering");
        mgr.display();

	}

}
