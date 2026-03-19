package Oops;
import java.util.*;

public class Java_OOPS {
	public static void main(String[] args) {
		
		
		//Q1
		System.out.println("============================================");
		System.out.println("================Program 1===================");
		System.out.println("============================================"); 
		Student s1 = new Student(); 
		s1.setData(5, "Aditya", 24);
		  
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter roll no.: ");
		int r = sc.nextInt(); 
		System.out.print("Enter Name: "); 
		String n = sc.next();
		System.out.print("Enter age: "); 
		int a = sc.nextInt();
		  
		Student s2 = new Student(); 
		s2.setData(r, n, a);
		  
		System.out.println(); 
		System.out.println("===Student 1==="); 
		s1.getData();
		  
		System.out.println(); 
		System.out.println("===Student 2==="); 
		s2.getData();
		System.out.println();
		 
		
		//Q2
		System.out.println("============================================");
		System.out.println("=================Program 2==================");
		System.out.println("============================================");
		Person p1 = new Person();
		p1.setData("Aditya", 24, "India");
		
		System.out.print("Enter name: ");
		String na = sc.next();
		System.out.print("Enter age: ");
		int ag = sc.nextInt();
		System.out.print("Enter Country: ");
		String c = sc.next();
		
		Person p2 = new Person();
		p2.setData(na, ag, c);
		
		System.out.println();
		System.out.println("===Person 1===");
		p1.getData();
		
		System.out.println();
		System.out.println("===Person 2===");
		p2.getData();
		System.out.println();
		
		//Q3
		System.out.println("============================================");
		System.out.println("=================Program 3==================");
		System.out.println("============================================");
		
		Person1 pp1=new Person1();
		Person1 pp2=new Person1("Shailesh");
		Person1 pp3=new Person1("Shailesh",20,"Uganda");
		
		System.out.println("Default");
		pp1.displayDetails();
		System.out.println();
		System.out.println("Name only");
		pp2.displayDetails();
		System.out.println();
		System.out.println("Full Params");
		pp3.displayDetails();
		System.out.println();
		
		//Q4
		System.out.println("============================================");
		System.out.println("=================Program 4==================");
		System.out.println("============================================");
		Person2 ppp1 = new Person2("Shailesh", 25, "UK");
		Person2 ppp2 = new Person2("Aditya", 24, "India");
		
		ppp1.display("Temp name", 54);
		
		int result = ppp1.compareAge(ppp2);
		if(result > 0)
			System.out.println("\n" + ppp1.getName() + " is older");
		else if(result < 0)
			System.out.println("\n" + ppp2.getName() + " is older");
		else
			System.out.println("\n Both are the same age");
	
		System.out.println();
		
		
		//Q5
		System.out.println("============================================");
		System.out.println("=================Program 5==================");
		System.out.println("============================================");
		BankAccount b1 = new BankAccount(1001, "Saving", 5000);
		BankAccount b2 = new BankAccount(1002, "Current", 15000);
		
		b1.deposit(2000);
		b1.withdraw(500);
		System.out.println("\n---Account 1---");
		b1.displayDetails();
		System.out.println("\n---Account 2---");
		b2.displayDetails();
		System.out.println();
		
		sc.close();
	}
}
