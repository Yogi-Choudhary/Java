package co.in.Constructors;

public class Pera {
	int empId;
	String empName;

	// parameterized constructor with two parameters
	Pera(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String args[]) {
		Pera obj1 = new Pera(10245, "Chaitanya");
		Pera obj2 = new Pera(92232, "Negan");
		obj1.info();
		obj2.info();
	}
}
