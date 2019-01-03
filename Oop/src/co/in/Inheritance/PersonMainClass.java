package co.in.Inheritance;

public class PersonMainClass {
public static void main(String[] args) {
	// Person Block
	Person p = new Person ();
	//p = new Person ();
	
	p.setName("Yogi");
	p.setAddress("MG Road");
	
	System.out.println("Name : " + p.getName());
	System.out.println("Address : " + p.getAddress());
	//Person Block
	System.out.println();
	System.out.println("Businessman");
	
	//Businessman Block
	
	Businessman b = new Businessman();
	//b = new Businessman();
	
	b.setIncome(1224345.45);
	b.setName("Yogesh");
	b.setAddress("MG Road");
	
	System.out.println("Name : " +b.getName());
	System.out.println("Address : " +b.getAddress());
	System.out.println("Income : " + b.getIncome());
	
	//Businessman Block
	System.out.println();
	System.out.println("Doctor");
	
	//Doctor Block
	
	Doctor d = new Doctor();
	d = new Doctor ();
	d.setName("Deep");
	d.setAddress("MG Road");
	d.setRegistrationNo("987456");
	
	
	System.out.println("Name : " +d.getName());
	System.out.println("Address : " +d.getAddress());
	System.out.println("RegistrationNo : " + d.getRegistrationNo());
	
	//DOctor Block
	
	System.out.println();
	System.out.println("Student");
	
	//Student Block
	
	Student s = new Student ();
	s = new Student ();
	s.setName("Vijay");
	s.setAddress("MG Road");
	s.setRollNo("012401200");
	s.setMake(90);
	
	System.out.println("Name : " +s.getName());
	System.out.println("Address : " +s.getAddress());
	System.out.println("RollNo : " + s.getRollNo());
	System.out.println("Make : " + s.getMake());
	//Student Block
}
}
