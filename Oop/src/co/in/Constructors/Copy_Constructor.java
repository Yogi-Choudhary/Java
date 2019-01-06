package co.in.Constructors;

public class Copy_Constructor {

	String web;

	Copy_Constructor(String w) {
		web = w;
	}

	/*
	 * This is the Copy Constructor, it copies the values of one object to the
	 * another object (the object that invokes this constructor)
	 */
	Copy_Constructor(Copy_Constructor je) {
		web = je.web;
	}

	void disp() {
		System.out.println("Website: " + web);
	}

	public static void main(String args[]) {
		Copy_Constructor obj1 = new Copy_Constructor("BeginnersBook");

		/*
		 * Passing the object as an argument to the constructor This will invoke the
		 * copy constructor
		 */
		Copy_Constructor obj2 = new Copy_Constructor(obj1);
		obj1.disp();
		obj2.disp();
	}
}
