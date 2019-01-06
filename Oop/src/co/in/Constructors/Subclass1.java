package co.in.Constructors;

public class Subclass1 extends Superclass1 {
	int num = 110;

	void printNumber() {
		/*
		 * Note that instead of writing num we are writing super.num in the print
		 * statement this refers to the num variable of Superclass
		 */
		System.out.println(super.num);
	}

	public static void main(String args[]) {
		Subclass obj = new Subclass();
		obj.printNumber();
	}
}
