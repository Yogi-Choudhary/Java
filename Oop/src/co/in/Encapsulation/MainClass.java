package co.in.Encapsulation;

import java.io.ObjectInputStream.GetField;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person();
		Account a = new Account();
		Automobile m = new Automobile();

		// Person Block
		p.setName("yogi");
		p.setAddress("MG Road");
		p.setDateOfBirth(15 / 8 / 97);

		System.out.println("Name : " + p.getName());
		System.out.println("Address : " + p.getAddress());
		System.out.println("Date : " + p.getDateOfBirth());

		// Person Block

		// Account Block

		a.setNumber("123456879");
		a.setType("Seving");
		a.setBalance(125466.77);

		System.out.println("Number : " + a.getNumber());
		System.out.println("Type : " + a.getType());
		System.out.println("Balance : " + a.getBalance());

		// Account Block

		// Automobile Block
		m.setColor("red");
		m.setSpeed(350);
		m.setGear(5);
		m.setMake("make");

		System.out.println("Color : " + m.getColor());
		System.out.println("Speed : " + m.getSpeed());
		System.out.println("Gead : " + m.getGear());
		System.out.println("Make : " + m.getMake());

		// Automobile Block
	}
}
